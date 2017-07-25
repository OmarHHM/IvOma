<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Registrar Producto</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
	<link href="${contextPath}/resources/css/style.css" rel="stylesheet" />
</head>
<body> 
	<form class="contact_form"  modelAttribute="productForm" id="contact_form" method="POST" > 

	<div id ="principal"> 

		<h2>Productos</h2> 
		<span class="required_notification" >* Datos requeridos</span>
		<table>
			<tr> 
				<td>
					<label for="idProduct">Número de Producto:</label> 
					<input type="text" /> 
				</td>
				<td> 
					<label for="desc">Descripción del Producto:</label> 
					<input type="text"  required /> 
				</td>
			</tr>
			<tr>
				<td>
					<label for="unitP">Precio Unitario:</label> 
					<input type="text" maxlenght="20" required/> 
				</td>
				<td> 
					<label for="descuent">Descuento:</label> 
					<input type="text" id="disccount"  required /> 
				</td>
			</tr>
			<tr>
				<td>
					<label for="total">Total:</label> 
					<input type="text" id="total"  required /> 
				</td> 
			
			 	<td> 
					<label for="exist">Existencia:</label> 
					<input type="text" name="existence"  required  /> 
				</td>
			</tr>
			<tr>
				<td>
					<label for="ima">Imagen:</label> 
					<input type="url" name="urlImage"  required  /> 
				</td>
			</tr>
			 
			<!-- <li> 
				<label for="message">Mensaje:</label> 
				<textarea name="message" cols="40" rows="6" required></textarea> 
			</li>  -->
		</table>
			<div  ALIGN="right">
				<button  class="submit" type="submit">Registrar</button> 		
			</div>	
	</div> 

	</form> 
</body> 
</html>