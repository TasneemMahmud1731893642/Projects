<?php

// create a variable
$Name=$_POST['Name'];
$Card_number=$_POST['Card_number'];
$CVV=$_POST['CVV'];
$Card_type=$_POST['Card_type'];



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

$sql = "INSERT INTO payment (Name,Card_number,CVV,Card_type)
VALUES ('$Name', '$Card_number','$CVV', '$Card_type')";



if ($conn->query($sql) === TRUE) {
    $message = "Payment Successful";
echo "<script type='text/javascript'>alert('$message');</script>";
    include 'landingpage.html';
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}


$conn->close();




?>