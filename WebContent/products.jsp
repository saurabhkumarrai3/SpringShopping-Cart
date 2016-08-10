<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="products" uri="/WEB-INF/CustomTags/custom.tld" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<products:printProducts/><br>

	 <form:form 	action="/ShoppingCartSpring/nextPage" name="submitForm" method="POST">
        <div align="center">
            <table>
            	<tr>
                    <td>Product Name<br></td>
                    <td><input type="text" name="pname" /></td>
                </tr>
                <tr>
                    <td>Product Quantity<br></td>
                    <td><input type="text" name="pquant" /></td>
                </tr>
                <tr>
                    <td><br></td>
                    <td><input type="submit" value="AddToCart" /></td>
                </tr>
            </table>
            <div style="color: red">${error}</div>
        </div>
    </form:form>	
	
</body>
</html>