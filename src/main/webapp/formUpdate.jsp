<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Editar Ong</title>
</head>
<body>
	<form action="OngUpdate" method="POST">
		<input name="id" value="${user.id}" style="display:none;"/>
		<input name="ongName" type="text" placeholder="Ong Name" value="${user.ongName}" />
		<input name="typePets" type="text" placeholder="Type Pets" value="${user.typePets}"/>
		<input name="email" type="text" placeholder="Email" value="${user.email}"/>
		<input name="phone" type="text" placeholder="Phone" value="${user.phone}"/>
		<input name="city" type="text" placeholder="City" value="${user.city}"/>
		<input name="zipCode" type="text" placeholder="Zip Code" value="${user.zipCode}"/>
		<input name="address" type="text" placeholder="Address" value="${user.address}"/>
		<input name="addressNumber" type="text" placeholder="Address Number" value="${user.addressNumber}"/>
		<input name="description" type="text" placeholder="Description" value="${user.description}"/>
		<button type="submit">Save</button>
	</form>
</body>
</html>