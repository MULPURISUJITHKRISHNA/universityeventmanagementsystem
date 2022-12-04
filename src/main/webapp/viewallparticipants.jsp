<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<style>
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: lightgreen;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: orange;
  color: white;
}
body {
                background-image: url('assets/img/spring.png');
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: cover;
            }
 .sidenav {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #06fefe;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidenav a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: #2f0cea;
  display: block;
  transition: 0.3s;
}

.sidenav a:hover {
  color: #f1f1f1;
}

.sidenav .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
</style>
</head>
<body>

<h1 align=center>University Event Management System</h1>

<br>
<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
	<a href="/adminhome">Home</a>
	<a class="active" href="viewallparticipants">View All Participants</a>
	<a href="adminlogin">Logout</a>
</div>
<span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776; Menu</span>

<script>
function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
}
</script>
<br><br>
<span class="blink">
<h3 align=center style="color: red"><c:out value="${msg}"/></h3>

</span>
<br>

<h3 align=center><u>View All Participants</u></h3>

<table align=center border=2>

<tr>

<th>ID</th>
<th>ParticipantID</th>
<th>Name</th>
<th>Gender</th>
<th>Date of Birth</th>
<th>Email ID</th>
<th>Username</th>
<th>Contact No</th>
<th>Action</th>

</tr>

<c:forEach items="${participantlist}" var="stud">

<tr>

<td> <c:out value="${stud.id}"></c:out>   </td>
<td> <c:out value="${stud.participantid}"></c:out>   </td>
<td> <c:out value="${stud.name}"></c:out>   </td>
<td> <c:out value="${stud.gender}"></c:out>   </td>
<td> <c:out value="${stud.dateofbirth}"></c:out>   </td>
<td> <c:out value="${stud.emailid}"></c:out>   </td>
<td> <c:out value="${stud.username}"></c:out>   </td>
<td> <c:out value="${stud.contactno}"></c:out>   </td>
<td> 

<a href='<c:url value='deleteparticipant?id=${stud.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewparticipantbyid?id=${stud.id}'></c:url>'>View</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 
