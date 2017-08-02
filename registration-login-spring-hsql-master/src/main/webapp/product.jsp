<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

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
	<link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
	<link href="${contextPath}/resources/css/style.css" rel="stylesheet" />
    <script src="${contextPath}/resources/js/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
	<script src="${contextPath}/resources/js/products/products.js"></script>
	 <script type="text/javascript" src='%=request.getContextPath()%>/dwr/interface/dwrService.js'></script>
     <script type="text/javascript" src='%=request.getContextPath()%>/dwr/engine.js'></script>
     <script type="text/javascript" src='%=request.getContextPath()%>/dwr/util.js'></script>
     <c:set var="contextPath1" value="%=request.getContextPath()"/>
     <script type="text/javascript">
     		alert(contextPath+"------"+contextPath1);
     
     </script>
</head>
<body> 
	<form:form class="contact_form"  modelAttribute="productForm" id="contact_form" method="GET" >
	<div id ="principal"> 
		<h2>Productos</h2> 
		<span class="required_notification" >* Datos requeridos</span>
		<table>
			<tr> 
				<td>
					<label for="idProduct">Número de Producto:</label> 
					<input id ="id" type="text" /> 
				</td>
				<td> 
					<label for="desc">Descripción del Producto:</label> 
					<input id="description" type="text"  required /> 
				</td>
			</tr>
			<tr>
				<td>
					<label for="unitP">Precio Unitario:</label> 
					<input id="unitPrice" type="text" maxlenght="20" required/> 
				</td>
				<td> 
					<label for="descuent">Descuento:</label> 
					<input id="discount" type="text" id="disccount"  required /> 
				</td>
			</tr>
			<tr>
				<td>
					<label for="total">Total:</label> 
					<input type="text" id="total"  required /> 
				</td> 
			
			 	<td> 
					<label for="exist">Existencia:</label> 
					<input id="existence" type="text" name="existence"  required  /> 
				</td>
			</tr>
			<tr>
				<td>
					<label for="ima">Imagen:</label> 
					<input id="urlImage" type="url" name="urlImage"  required  /> 
				</td>
			</tr>
			 
			<!-- <li> 
				<label for="message">Mensaje:</label> 
				<textarea name="message" cols="40" rows="6" required></textarea> 
			</li>  -->
			
		</table>
		<div align="right">
			<button  id="agregar" class="submit" type="submit">Registrar</button> 	
			<button  id="modificar" class="submit" type="submit">Modificar</button> 
			<button  id="eliminar" class="submit" type="submit">Eliminar</button> 		
		</div>
	</div> 
	</form:form> 
</body> 
</html>