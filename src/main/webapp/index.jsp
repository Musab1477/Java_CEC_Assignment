<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Car Management</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 800px;
            margin: 100px auto;
            text-align: center;
            background-color: #fff;
            padding: 50px;
            border-radius: 10px;
            box-shadow: 0px 0px 15px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333;
            font-size: 36px;
        }
        .btn-container {
            display: flex;
            justify-content: space-around;
            margin-top: 40px;
        }
        .btn {
            background-color: #4CAF50;
            border: none;
            color: white;
            padding: 15px 25px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
            cursor: pointer;
        }
        .btn:hover {
            background-color: #45a049;
        }
        .btn-delete {
            background-color: #f44336;
        }
        .btn-update {
            background-color: #ffa500;
        }
        .btn-delete:hover, .btn-update:hover {
            opacity: 0.8;
        }
    </style>
</head>
<body>

    <div class="container">
        <h1>Car Management System</h1>
        <div class="btn-container">
            <a href="addcar.jsp" class="btn">Add a New Car</a>
            <a href="displaycars" class="btn">Display Cars</a>
            <a href="deletecar" class="btn btn-delete">Delete Car</a>
            <a href="update" class="btn btn-update">Update Car Details</a>
        </div>
    </div>

</body>
</html>
