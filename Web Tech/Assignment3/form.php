<html>
<head>
    <!-- <link rel="stylesheet" href="style.css"> -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        body{
            background-image: url(background_image.png);
            background-position: center;
            background-size: cover;
            font-family: sans-serif;
            margin-top: 40px;
            color: white;
        }
        .regform{
            width: 800px;
            background-color: #B2BEB5;
            margin: auto;
            color: #FFFFFF;
            padding: 10px 0px 10px 0px;
            text-align: center;
            border-radius: 15px 15px 0px 0px;
        }
        .main{
            background-color: rgb(0,0,0,0.5);
            width: 800px;
            margin: auto;
        }
        form{
            padding: 10px;
        }
        #name{
            width: 100%;
            height: 100px;
        }
        .name{
            margin-left: 25px;
            margin-top: 30px;
            width: 125px;
            color: white;
            font-size: 18px;
            font-weight: 700;
        }
        .first_name{
            position: relative;
            left: 200px;
            top: -37px;
            line-height: 40px;
            border-radius: 6px;
            padding: 0 22px;
            font-size: 16px;
        }
        .last_name{
            position: relative;
            left: 417px;
            top: -80px;
            line-height: 40px;
            border-radius: 6px;
            padding: 0 22px;
            font-size: 16px;
            color: #555;
        }
        .firstlabel{
            position: relative;
            color: white;
            text-o-transform: capitalize;
            font-size: 14px;
            left: 203px;
            top: -45px;
        }
        .lastlabel{
            position: relative;
            color: white;
            text-o-transform: capitalize;
            font-size: 14px;
            left: 488px;
            top: -99px;
        }
        .email{
            position: relative;
            left: 200px;
            top: -37px;
            line-height: 40px;
            width: 480px;
            font-size: 16px;
            borborder-radius: 6px;
            padding: 0 22px;
        }
        .my_add{
            position: relative;
            left: 200px;
            top: -37px;
            line-height: 40px;
            width: 480px;
            font-size: 16px;
            borborder-radius: 10px;
            padding: 0 22px;
        }
        .my_photo{
            position: relative;
            left: 200px;
            top: -37px;
            line-height: 40px;
            width: 480px;
            font-size: 16px;
            borborder-radius: 10px;
            padding: 0 22px;
        }
        button{
            display: inline;
            margin: 20px 0px 2px 95px;
            text-align: center;
            border-radius: 12px;
            border: 2px solid #555;
            padding: 14px 110px;
            outline: none;
            color: white;
            cursor: pointer;
            transition: 0.25px;
        }
        #submit{
            background-color: green;
        }
        #reset{
            background-color: red;
        }
    </style>
</head>
    
<body>
<div class="regform"><h1>Registration Form</h1></div>
<div class="main">
<form action="Mysite.php" method="post" enctype="multipart/form-data">
<div id="name">
    <h2 class="name">Name</h2>
    <input class="first_name" type="text" name="first_name" required ><br>
    <label class="firstlabel">first name</label>
    <input class="last_name" type="text" name="last_name" required ><br><br>
    <label class="lastlabel">last name</label>
</div>

<h2 class="name">Email</h2>
<input class="email" type="email" name="email" required ><br><br>
<h2 class="name">Address</h2>
<textarea class="my_add" name="my_add" rows="2" cols="50" required ></textarea><br><br>
<h2 class="name">Photo</h2>
<input class="my_photo" type="file" name="photo" id="my_photo" required ><br><br>
<button id="reset" type="reset" value="Reset">Reset</button> 
<button id="submit" type="submit" value="Submit">Submit</button>
</form>
</div>
</body>
</html>
