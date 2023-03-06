<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <style>
    </style>
</head>

<body>
    <?php
   
    $host = "localhost";
    $user = "root";
    $password = "";
    $dbname = "formDatabase";

    $conn = new mysqli($host, $user, $password, $dbname);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    // Prepare a SQL statement to insert the form data into a table
    $stmt = $conn->prepare("INSERT INTO form_table (first_name, last_name, email, address, photo) VALUES (?, ?, ?, ?, ?)");
    $stmt->bind_param("sssss", $first_name, $last_name, $email, $address, $photo_path);

    // Get the form data
    $first_name = $_POST["first_name"];
    $last_name = $_POST["last_name"];
    $email = $_POST["email"];
    $address = $_POST["my_add"];

    // Move the uploaded file to a permanent location
    $photo_name = $_FILES["photo"]["name"];
    $photo_tmp = $_FILES["photo"]["tmp_name"];
    $photo_path = "photos/" . $photo_name;
    move_uploaded_file($photo_tmp, $photo_path);
    // Execute the SQL statement
    $stmt->execute();

    // Close the statement and connection
    $stmt->close();
    $conn->close();

    ?>
    <div class='conatiner'>
        <div class="row" style="width:100vw;height:100vh">
            <div class="col d-flex justify-content-center align-items-center" style="padding:40px;">
                Name:
                <?php echo $_POST["first_name"]; ?>
                <?php echo " ", $_POST["last_name"]; ?><br><br>
                Email:
                <?php echo $_POST["email"]; ?><br><br>
                Address:
                <?php echo $_POST["my_add"]; ?><br>
            </div>
            <div class="col d-flex justify-content-center align-items-center"
                style="padding:40px; backbackground-color: black;">
                <?php echo "<img src='" . $photo_path . "' style='border-radius: 70%; width: 300px; height: 300px;'>"; ?>
            </div>
        </div>
    </div>
</body>

</html>
