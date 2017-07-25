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

    <title>Inicio</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <script src="${contextPath}/resources/js/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="${contextPath}/resources/css/index_style.css">
</head>
<body>
<div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
        <h2>Bienvenido ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Salir</a></h2>
    </c:if>
</div>
<header>
		<div class="contenedor" id="uno" >
			<form id="userForm" method="GET" action="${contextPath}/users">
				<img class="icon" src="${contextPath}/pictures/usuario.png">
				<p class="texto">Usuarios</p>	
			</form>
		</div>
		<div id="separator"></div>
		<div class="contenedor" id="dos" onclick="document.forms['productForm'].submit()">
			<form id="productForm" method="GET" action="${contextPath}/products">
				<img class="icon" src="${contextPath}/pictures/products.png">
				<p class="texto">Productos</p>
			</form>
		</div>
		<div id="separator"></div>
		
		<div class="contenedor" id="tres">
			<form id="employeForm" method="GET" action="${contextPath}/employes">
				<img class="icon" src="${contextPath}/pictures/icon3.png">
				<p class="texto">Personal</p>
			</form>
		</div>
</header>

<header>
		<div class="contenedor" id="cuatro">
			<form id="saleForm" method="GET" action="${contextPath}/sales">
				<img class="icon" src="${contextPath}/pictures/ventas.png">
				<p class="texto">Ventas</p>
			</form>
		</div>
		
		<div id="separator"></div>
		<div class="contenedor" id="cinco">
			<form id="purchaseForm" method="GET" action="${contextPath}/purchases">
				<img class="icon" src="${contextPath}/pictures/icon5.png">
				<p class="texto">Pedidos</p>
			</form>
		</div>

		<div id="separator"></div>
		<div class="contenedor" id="seis">
			<form id="billForm" method="GET" action="${contextPath}/bills">
				<img class="icon" src="${contextPath}/pictures/icon6.png">
				<p class="texto">Facturas</p>
			</form>
		</div>
</header>
</body>
</html>
