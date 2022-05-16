<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>All Ongs</title>
</head>
<body>
	<h1>All Ongs</h1>
	
	<div>
		<ul>
			<c:forEach items="${users}" var="user">
				<li>
					<p>${user.ongName}</p>
					<p>${user.typePets}</p>
					<p>${user.email}</p>
					<p>${user.phone}</p>
					<p>${user.city}</p>
					<p>${user.zipCode}</p>
					<p>${user.address}</p>
					<p>${user.addressNumber}</p>
					<p>${user.description}</p>
					<div>
						<a href="OngUpdate?userId=${user.id}">Editar</a>
						<a href="OngDelete?userId=${user.id}">Deletar</a>
					</div>
					
				</li>
			</c:forEach>
		
		</ul>
	</div>
	
	<h3><a href="index.html">Voltar a tela de cadastro</a></h3>
</body>
</html>