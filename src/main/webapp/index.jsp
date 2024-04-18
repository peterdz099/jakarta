<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Management System</title>
</head>
<body>
<h1>Employee Management System</h1>

<h2>Add Employee</h2>
<form action="employee" method="post">
    <label for="addId">First Name:</label>
    <input type="number" id="addId" name="id" required><br><br>

    <label for="addFirstName">First Name:</label>
    <input type="text" id="addFirstName" name="firstName" required><br><br>

    <label for="addLastName">Last Name:</label>
    <input type="text" id="addLastName" name="lastName" required><br><br>

    <label for="addPosition">Position:</label>
    <input type="text" id="addPosition" name="position" required><br><br>

    <button type="submit">Add Employee</button>
</form>

<h2>Update Employee</h2>
<form action="employee" method="post">
    <input type="hidden" name="_method" value="put" />
    <label for="updateId">Employee ID to Update:</label>
    <input type="number" id="updateId" name="id" required><br><br>

    <label for="updateFirstName">First Name:</label>
    <input type="text" id="updateFirstName" name="firstName" required><br><br>

    <label for="updateLastName">Last Name:</label>
    <input type="text" id="updateLastName" name="lastName" required><br><br>

    <label for="updatePosition">Position:</label>
    <input type="text" id="updatePosition" name="position" required><br><br>

    <button type="submit">Update Employee</button>
</form>

<h2>Display Employee</h2>
<form action="employee" method="get">
    <label for="displayId">Employee ID to Display:</label>
    <input type="number" id="displayId" name="id" required><br><br>

    <button type="submit">Display Employee</button>
</form>

<h2>All Employees</h2>
<form action="employee" method="get">
    <button type="submit">Display All Employees</button>
</form>
</body>
</html>