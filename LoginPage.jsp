
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="LoginController">

			Please enter your username: 		
			<input type="text" id ="name" name="username"/><br>		
		
			Please enter your password:
			<input type="text" name="password"/>
			
			<input type="submit" value="submit" onClick="pr()">
			</form>
			<script>
			function pr()
			{
			var name = document.getElementById("name").value;
			//alert(name);
			document.innerText(name);
			}
			</script>
			
</body> 

</html>
