<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Information Form</title>
</head>
<body>
    <h2>Student Information Form</h2>
    <form action="getstudent" method="post">
        <label for="studentId">Student ID:</label>
        <input type="text" id="studentId" name="studentId"><br><br>
        
        <label for="studentName">Student Name:</label>
        <input type="text" id="studentName" name="studentName"><br><br>
        
        <label for="studentNumber">Student Number:</label>
        <input type="text" id="studentNumber" name="studentNumber"><br><br>
        
        <label for="studentCountry">Student Country:</label>
        <input type="text" id="studentCountry" name="studentCountry"><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
