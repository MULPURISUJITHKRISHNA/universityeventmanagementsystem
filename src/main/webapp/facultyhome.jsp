<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

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
  background-color: yellow;
}

li 
{
  float: left;
    border-right: 1px light blue;
}

li a 
{
  display: block;
  color: lightblue;
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
                background-image: url('assets/img/events.png');
                background-repeat: no-repeat;
                background-attachment: local;
                background-size: cover;
      }

.sidenav {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #2df317;
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
    <a class="active" href="facultyhome">Home</a>
  <a href="viewfaculty">View Profile</a>
  <a href="event">Add Event</a>
   <a href="viewevent">View Event</a>
  <a href="facultychangepwd">Change Password</a>
  <a href="facultylogin">Logout</a>
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

<h3 align=center style="font-style: normal;font-family: cursive;font-size: xx-large;">Welcome&nbsp;<c:out value="${euname}"></c:out></h3>

</body>
</html>