<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Clase java</title>
</head>
<body>
<header>
    <h1>EJEMPLO 03</h1>
</header>
<br>
<section>
    <h1>Formulario de registro de viaje</h1>
    <form action="destino.jsp" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre"><br>
        <label for="apellido">Apellido:</label>
        <input type="text" id="apellido" name="apellido"><br>
        <label for="promedio">Promedio:</label>
        <input type="text" id="promedio" name="promedio"><br>
        <input type="submit" name="Enviar">
        <input type="reset" name="Borrar">
    </form>
</section>
</body>
</html>