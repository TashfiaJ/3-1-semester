<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "cw";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}

$sql = "INSERT INTO item (name,price)
VALUES ('$_POST[my_name]',$_POST[my_price])";

if ($conn->query($sql) === TRUE) {
  echo "New record created successfully";
} else {
  echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();
}
?>
