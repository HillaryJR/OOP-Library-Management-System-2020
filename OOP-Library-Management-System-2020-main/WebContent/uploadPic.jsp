<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link rel = "stylesheet" href ="UM.css">
		<title>Upload Profile Photo	</title>
	</head>
	<body>
		<%@include file="/header.jsp" %>
		<div class="photoCont">
			<label id="edPhoto" >Update Your Profile Photo</label><br/><br/>
			<form action="update2" method="post" enctype="multipart/form-data" cellpadding="10px" cellspacing="10px">
				<table>
					<tr>	
						<td><input type="file" name="filename" id="inPho" value="filename"></td>
					</tr>
				</table><br/><br/>
				<input type="submit" name="submit" id="btnPho" value="Update My Data">
			</form>		
		</div>		
	</body>
	<%@include file="/footer.jsp" %>
</html>