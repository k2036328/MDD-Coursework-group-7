<!doctype html>
<html>
    <head>
        <title>Booking basket page</title>
        <style>
        th {
            padding: 15px;
            border: 1px solid black;
        }
        #backToHome {
                margin:15px;
                padding:10px;
                background-color: yellow;
            }
        </style>
    </head>
    <body background="background6.jpg">
        <p>Hello Booking basket!</p>
        <h2><u>My Bookings</u></h2>
        <table>
            <thead>
                <tr>
                    <th>Booking Id</th>
                    <th>Bus</th>
                    <th>Destination</th>
                    <th>Depart date</th>
                    <th>Arrive date</th>
                    <th>Required date</th>
                    <th>Required license</th>
                    <th>Total price</th>
                </tr>
            </thead>
            <tbody>
            <?php foreach ($results as $BookingData) : ?>
            <tr>
                <td><?=$BookingData->bookingId ?></td>
                <td><?=$BookingData->bus ?></td>
                <td><?=$BookingData->destination ?></td>
                <td><?=$BookingData->departDate ?></td>
                <td><?=$BookingData->arriveDate ?></td>
                <td><?=$BookingData->requiredDate ?></td>
                <td><?=$BookingData->requiredLicense ?></td>
                <td><?=$BookingData->totalPrice ?></td>
            </tr>
            <?php endforeach ?>
                
            </tbody>
        </table>
        <button id="backToHome"><a href="index.php">back to home </a></button>
        <form method="post" action="BookingBasket.php">
            <div>
                delete booking by ID: <input type="text" name="deletebookingById" placeholder="Type Booking Id" />
                <input type="submit" value="delete!" />
                <button id="refresh"><a href="BookingBasket.php">click here to refresh </a></button>
            </div>
        </form>
        
        
    </body>
</html>