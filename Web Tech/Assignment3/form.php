<html>
<head>
    <link rel="stylesheet" href="style.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <style>
    </style>
</head>
    
<body>

<form action="Mysite.php" method="post" enctype="multipart/form-data">
First Name: <input type="text" name="first_name" required >
Last Name: <input type="text" name="last_name" required ><br><br>
Email: <input type="email" name="email" required ><br><br>
Address: <textarea name="my_add" rows="2" cols="50" required ></textarea><br><br>
Photo: <input type="file" name="photo" id="my_photo" required ><br><br>
<input type="reset" value="cancel"> 
<input type="submit" name="submit">
</form>

</body>
</html>
