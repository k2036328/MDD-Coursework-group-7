<?php
session_start();
if (!isset($_SESSION["previousSearch"]))
{
    $_SESSION["previousSearch"] = [];
}
?>
<!doctype html>
<?php require_once "/home/k1746516/www/model2/BerwynBus.php" ?>
<?php require_once "/home/k1746516/www/model2/dataAccess2.php" ?>
<?php
/*if (isset($_REQUEST["search"]) && $_REQUEST["searchPrice"] && $_REQUEST["searchAvailableDate"] != "")*/
/*if (isset($_REQUEST["search"]) && $_REQUEST["searchPrice"] && $_REQUEST["searchAvailableDate"] != "")*/
if (isset($_REQUEST["search"]) && $_REQUEST["searchPrice"] != "")
{
    $passengers = $_REQUEST["search"];
    $_SESSION["previousSearch"] [] = $passengers;
    $results = getBusesByPassengers($passengers);
  
    $price = $_REQUEST["searchPrice"];
    $_SESSION["previousSearch"] [] = $price;
    $results = getBusesByPrice($price);
/*
    $date = $_REQUEST["searchAvailableDate"];
    $_SESSION["previousSearch"] [] = $date;
    $results = getBusesByDate($date);
 */
}
else if (isset($_REQUEST["search"]))
{
   $passengers = $_REQUEST["search"];
   $_SESSION["previousSearch"] [] = $passengers;
   $results = getBusesByPassengers($passengers);
}
else if (isset($_REQUEST["searchPrice"]))
{
    $price = $_REQUEST["searchPrice"];
    $_SESSION["previousSearch"] [] = $price;
    $results = getBusesByPrice($price);
}
/*else if (isset($_REQUEST["searchAvailableDate"]))
{
    $date = $_REQUEST["searchAvailableDate"];
    $_SESSION["previousSearch"] [] = $date;
    $results = getBusesByDate($date);
}*/
else 
{
    $results = getAllBuses();
}
?>
 <?php require_once "/home/k1746516/www/model2/view/FindBus_view.php" ?>
 <html>
 <body>

 </body>
 </html>