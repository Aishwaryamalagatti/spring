<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vaccination Registration</title>
</head>
<body>
	<h2>Corona Vaccination Form</h2>
	<form action="register.do">
		<pre>
Name          <input type="text" name="name" />
Age           <select name="age">
               <option>SELECT</option>
               <option>Less than 18</option>
               <option>Greater than 18, less than 45</option>
               <option>Greater than 45 ,less than 60</option>
               <option>Greater than 60</option>
</select>
Aadhar       <input type="text" name="aadhar" />
Location     <select name="location">
              <option>SELECT</option>
              <option>Bangalore</option>
              <option>Mysore</option>
              <option>Dharwad</option>
              <option>Hubballi</option>
</select>
Mobile Number <input type="text" name="mobile" />
<input type="submit" value="Register" />
</pre>
	</form>
	<a href="feedback.do">Feedback</a>
</body>
</html>