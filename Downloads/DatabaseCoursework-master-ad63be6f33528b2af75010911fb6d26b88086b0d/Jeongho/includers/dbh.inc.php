<?php

$servername = "localhost";
$dBUsername = "root";
$dBPassword = "";
$dBName = "loginsystem"

$connection = mysqli_connect($servername, $dBUsername, $dBPassword, $dBName);

if (!$connection) {
    die("Connection failed");
}

