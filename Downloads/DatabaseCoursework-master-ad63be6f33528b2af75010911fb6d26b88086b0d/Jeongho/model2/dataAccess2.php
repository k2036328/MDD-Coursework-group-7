<?php
    $pdo = new PDO("mysql:host=kunet;dbname=db_k1741900",
                   "k1741900",
                   "apple1",
                   [PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION]);


function insertBooking($params)
{
    
    global $pdo;
    $statement = $pdo->prepare("INSERT INTO Booking (bookingId, bus, destination, departDate, arriveDate,
    requiredDate, requiredLicense, totalPrice) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

    $statement->execute([$params->bookingId, $params->bus, $params->destination, $params->departDate, 
    $params->arriveDate, $params->requiredDate, $params->requiredLicense, $params->totalPrice]);
    //$results = $statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    //return $results;

/*
    global $pdo;
    $statement=$pdo->prepare("INSERT INTO Booking ('bookingId', 'bus', 'destination', 'departDate', 'arriveDate', 'requiredDate', 'requiredLicense', 'totalPrice') VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
    $statement->execute([$params]);
    $results = $statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    return $results;
    */
}

function getAllBookings()
{
    global $pdo;
    $statement = $pdo->prepare("SELECT * FROM Booking");
    $statement->execute();
    $results = $statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    return $results;
}

function deleteBookingById($bookingId)
{
    global $pdo;
    $statement = $pdo->prepare("DELETE FROM Booking WHERE bookingId = $bookingId");
    $statement->execute();
    //$results = $statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    //return $results;
    //$statement->bindParam(":bookingId",$bookingId, PDO::PARAM_INT);
    //return $statement->execute();
}

function getBusesByStartOfWord($partialWord)
{
    global $pdo;
    $statement = $pdo->prepare('SELECT DISTINCT model FROM Vehicles
                              WHERE model like ?');
    $statement->execute(["$partialWord%"]);
    $users = $statement->fetchAll(PDO::FETCH_COLUMN, 0);
    return $users;
}

function getAllBuses()
{
    global $pdo;
    $statement = $pdo->prepare("SELECT * FROM Vehicles");
    $statement-> execute();
    $results = $statement->fetchAll(PDO::FETCH_CLASS, "BerwynBus");
    return $results;
}

function getAllCustomers()
{
    global $pdo;
    $statement = $pdo->prepare("SELECT * FROM Customers");
    $statement->execute();
    $results = $statement->fetchAll(PDO::FETCH_CLASS, "Customer");
    return $results;
}



//throw new Exception("ERRRRROR"); NEEDED
function getBusesByPassengers($passengers)
{
    if($passengers == "")
    {
        return getAllBuses();
    }
    global $pdo;
    $statement = $pdo->prepare("SELECT * FROM Vehicles WHERE capacity >= $passengers");
    $statement->execute([$passengers]);
    $results = $statement->fetchAll(PDO::FETCH_CLASS, "BerwynBus");
    return $results;
}

function getBusesByPrice($price)
{
    if($price == "")
    {
        return getAllBuses();
    }
    global $pdo;
    $statement = $pdo->prepare("SELECT * FROM Vehicles WHERE hourlyRate <= $price");
    $statement->execute([$price]);
    $results = $statement->fetchAll(PDO::FETCH_CLASS, "BerwynBus");
    return $results;
}

function getBusesByDate($date)
{
    if($date == "")
    {
        return getAllBuses();
    }
    global $pdo;
    $statement = $pdo->prepare("SELECT * FROM Vehicles WHERE dateOfAvailability >= $date ");
    $statement->execute([$date]);
    $results = $statement->fetchAll(PDO::FETCH_CLASS, "BerwynBus");
    return $results;
}

function test_input($data)
{
    $data = trim($data);
    $data = stripslashes($data);
    $data = htmlspecialchars($data);
    return $data;
}
/*
function insertBooking($params = array())
{
    global $pdo;
    $statement = $pdo->prepare("INSERT INTO Booking (bookingId,bus,destination,departDate,arriveDate,
    requiredDate,requiredLicense,totalPrice) VALUES (:bookingId,:bus,:destination,:departDate,:arriveDate,
    :requiredDate,:requiredLicense,:totalPrice)");
    $statement->bindValue(':bookingId',$BookingData->bookingId);
    $statement->bindValue(':bus',$BookingData->bus);
    $statement->bindValue(':destination',$BookingData->destination);
    $statement->bindValue(':departDate',$BookingData->departDate);
    $statement->bindValue(':arriveDate',$BookingData->arriveDate);
    $statement->bindValue(':requiredDate',$BookingData->requiredDate);
    $statement->bindValue(':requiredLicense',$BookingData->requiredLicense);
    $statement->bindValue(':totalPrice',$BookingData->totalPrice);
    
    $statement->execute();
    $results=$statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    return $results;
}
*/
/*
function insertBooking($booking)
{
    global $pdo;
    //$pdo = $this->getPDO();
    $statement = $pdo->prepare("INSERT INTO Booking(bookingId,bus,destination,departDate,arriveDate,
    requiredDate,requiredLicense,totalPrice) VALUES (:bookingId,:bus,:destination,:departDate,:arriveDate,
    :requiredDate,:requiredLicense,:totalPrice)");
    $statement->bindParam(":bookingId",$BookingData->bookingId,PDO::PARAM_INT);
    $statement->bindParam(":bus", $BookingData->bus);
    $statement->bindParam(":destination", $BookingData->destination);
    $statement->bindParam(":departDate", $BookingData->departDate);
    $statement->bindParam(":arriveDate", $BookingData->arriveDate);
    $statement->bindParam(":requiredDate", $BookingData->requiredDate);
    $statement->bindParam(":requiredLicense", $BookingData->requiredLicense);
    $statement->bindParam(":totalPrice", $BookingData->totalPrice);

    return $statement->execute([$booking]);
}
*/
/*
function getPostFieldValue($fieldName, $required, $defaultValue="")
{
    if(isset($_POST[$fieldName]))
    {
        return htmlentities($_POST[$fieldName]);
    }
    if($required)
    {
        throw new AppException("Field $fieldName required");
    }
    return $defaultValue;
}
*/
function getDateInMYSQLFormat($date)
{
    return $date == "" ? "": DateTime::createFromFormat('Y-m-d',$date)->format('d/m/Y');
}






function insertBookingBookingId($data)
{
    global $pdo;
    $statement=$pdo->prepare("INSERT INTO Booking (bookingId) VALUES (?)");
    $statement->execute([$data]);
    //$results = $statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    //return $results; 두번쨰 할때는 얘만 패스했어
}

function insertBookingBus($data)
{
    global $pdo;
    $statement=$pdo->prepare("INSERT INTO Booking (bus) VALUES (?)");
    $statement->execute([$data]);
    //$results = $statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    //return $results; 첨에 얘네 둘만 패스했어
}

function insertBookingDestination($data)
{
    global $pdo;
    $statement=$pdo->prepare("INSERT INTO Booking (destination) VALUES (?)");
    $statement->execute([$data]);
    //$results = $statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    //return $results;
}

function insertBookingDepartDate($data)
{
    global $pdo;
    $statement=$pdo->prepare("INSERT INTO Booking (departDate) VALUES (?)");
    $statement->execute([$data]);
    //$results = $statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    //return $results;
}

function insertBookingArriveDate($data)
{
    global $pdo;
    $statement=$pdo->prepare("INSERT INTO Booking (arriveDate) VALUES (?)");
    $statement->execute([$data]);
    //$results = $statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    //return $results;
}

function insertBookingRequiredDate($data)
{
    global $pdo;
    $statement=$pdo->prepare("INSERT INTO Booking (requiredDate) VALUES (?)");
    $statement->execute([$data]);
    //$results = $statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    //return $results;
}

function insertBookingRequiredLicense($data)
{
    global $pdo;
    $statement=$pdo->prepare("INSERT INTO Booking (requiredLicense) VALUES (?)");
    $statement->execute([$data]);
    //$results = $statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    //return $results;
}

function insertBookingTotalPrice($data)
{
    global $pdo;
    $statement=$pdo->prepare("INSERT INTO Booking (totalPrice) VALUES (?)");
    $statement->execute([$data]);
    //$results = $statement->fetchAll(PDO::FETCH_CLASS, "BookingData");
    //return $results;
}

?>