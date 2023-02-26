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
    $image = $_FILES['photo']['name'];
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
            <div class="col d-flex justify-content-center align-items-center" style="padding:40px; background-color: black;">
                    <?php echo "<img src='" . $image . "'   style='border-radius: 70%; width: 300px; height: 300px;'>" ?>
            </div>
        </div>
    </div>
</body>

</html>
