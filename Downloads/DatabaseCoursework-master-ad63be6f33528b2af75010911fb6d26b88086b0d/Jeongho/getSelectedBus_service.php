<?php
header('Content-Type: application/json');
include 'model2/BerwynBus.php';
include 'model2/dataAccess2.php';

if(!isset($_REQUEST["bus"]))
{
    echo json_encode([]);
}
else
{
    $buses = getBusesByStartOfWord($_REQUEST["bus"]);
    echo json_encode($buses);
}
?>