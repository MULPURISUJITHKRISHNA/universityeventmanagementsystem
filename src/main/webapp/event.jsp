<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>

    
   <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Event </title>
</head>
<body bgcolor="#87CEFA">
    <h1 style="text-align: center;">Add Event</h1>
    <form:form action="addevent" method="post" modelAttribute="e">
    
    <table align="Center">
        <tr>
            <td><label>Event Name</label></td>
            <td><form:input path="evname" required="required"></form:input>
</td>
        </tr>
        <tr><td></td></tr>
        
        
       <tr>
<td><label>EventType</label></td>
<td>
<form:select path="evtype" required="required">
<form:option value="-1">---Select---</form:option>
<form:option value="Technical">Technical</form:option>
<form:option value="NonTechnical">NonTechnical</form:option>
<form:option value="Cultural">Cultural</form:option>
</form:select>
</td>
</tr>

<tr><td></td></tr>

<tr>
<td><label>EventDate</label></td>
<td><form:input path="evdate" required="required"/></td>



</td>
</tr>

<tr><td></td></tr>
        



         <tr>
            <td><label >Event Venue</label></td>
            <td><form:input path="evvenue" required="required"/></td>
        </tr>

        <tr>
            <td><label>StudentCoordinatorName:</label></td>
            <td><form:input path ="studentcodname" required="required"/></td>
        </tr>
        
         <tr>
            <td><label>StudentCoordinatorEmailId:</label></td>
           <td><form:input path ="studentcodemailid" required="required"/></td>
        </tr>
        
          <tr>
            <td><label>StudentCoordinatorContact:</label></td>
            <td><form:input path ="studentcontact" required="required"/></td>
        </tr>
        
        
        <tr>
            <td><label>StudentCoordinatorUsername:</label></td>
            <td><form:input path ="studentcodusername" required="required"/></td>
        </tr>
        
        <tr align=center>
            <td colspan="2"><input type="submit" value="Register" class="button"></td>
        </tr>



    </table>
    </form:form>
</body>

</html>