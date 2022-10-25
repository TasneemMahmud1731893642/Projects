<?php

// create a variable
$Name=$_POST['Name'];
$Phone=$_POST['Phone'];
$Email=$_POST['Email'];
$Movie=$_POST['Movie'];
$Time=$_POST['Time'];
$Hall_and_Price=$_POST['Hall_and_Price'];



$servername = "localhost";
$username = "root";
$password = "";
$dbname = "project";


// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "INSERT INTO movie (Name,Movie,Hall_and_Price,Time)
VALUES ('$Name', '$Movie','$Hall_and_Price', '$Time')";
$sql2 = "INSERT INTO customer (Name,Email,Phone)
VALUES ('$Name', '$Email','$Phone')";



if ($conn->query($sql) === TRUE) {
    
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}
if ($conn->query($sql2) === TRUE) {
    include 'paymentpage.html';
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();




?>