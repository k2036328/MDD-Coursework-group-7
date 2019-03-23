<?php
session_start();

?>
<!doctype html>
<?php include 'model2/BookingData.php'; ?>
<?php

?>
<?php include 'model2/dataAccess2.php'; ?>
<?php
if(isset($_REQUEST["bookingId"]))
{
  $bookingId = $_REQUEST["bookingId"];
  $bus = $_REQUEST["bus"];
  $destination = $_REQUEST["destination"];
  $departDate = $_REQUEST["departDate"];
  $arriveDate = $_REQUEST["arriveDate"];
  $requiredDate = $_REQUEST["requiredDate"];
  $requiredLicense = $_REQUEST["requiredLicense"];
  $totalPrice = $_REQUEST["totalPrice"];
  
  $BookingDatas = new BookingData();
  $BookingDatas->bookingId = htmlentities($bookingId);
  $BookingDatas->bus = htmlentities($bus);
  $BookingDatas->destination = htmlentities($destination);
  $BookingDatas->departDate = htmlentities($departDate);
  $BookingDatas->arriveDate = htmlentities($arriveDate);
  $BookingDatas->requiredDate = htmlentities($requiredDate);
  $BookingDatas->requiredLicense = htmlentities($requiredLicense);
  $BookingDatas->totalPrice = htmlentities($totalPrice);

  insertBooking($BookingDatas);
  
}
$results = getAllBookings();

if(isset($_REQUEST["deletebookingById"]))
{
  $deletebookingById = $_REQUEST["deletebookingById"];
  deleteBookingById($deletebookingById);
  
}
//$bookingDatas = ($bookingId,$bus,$destination,$departDate,$arriveDate,$requiredDate,$requiredLicense,$totalPrice);
//$results = insertBooking($BookingDatas);
?>
<?php include 'model2/view/BookingBasket_view.php'; ?>
<html>
<body>

</body>
</html>

