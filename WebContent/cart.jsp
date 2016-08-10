<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="cart" uri="/WEB-INF/CustomTags/customCart.tld" %>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<cart:printCart/><br>
	<center>
<!-- 		action="/ShoppingCartSpring/nextPage" -->
	 <form:form  name="submitForm" method="POST">
	 <tr>
	<td><input type="submit" class="button" name="addCart" value="AddCart"/></td>
	</tr>
	<br><br>
				<b>Select item to remove</b>
	 <table>
            	
            	<tr>
                    <td>Product Name<br></td>
                    <td><input type="text" name="pname" /><br></td>
                </tr>
                <tr>
                    <td>Product Quantity<br></td>
                    <td><input type="text" name="pquant" /></td>
                </tr>
                <tr>
                    <td><br></td>
                   <td><input type="submit" class="button" name="delete" value="Delete"/></td>
                </tr>
      </table>
	
	
	 </form:form>	
	</center>
</body>
</html>