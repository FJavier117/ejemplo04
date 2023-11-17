<%--
  Created by IntelliJ IDEA.
  User: mende
  Date: 14/11/2023
  Time: 09:49 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Destino</title>
</head>
<body>
<%@ page import="com.fjavmvazquez.ejemplo04.model.Alumno" %>
<%@ page import="com.fjavmvazquez.ejemplo04.model.service.Archivo" %>
<%
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String promedio = request.getParameter("promedio");

    Alumno alumno = new Alumno(nombre,apellido,promedio);
    ServletContext servletContext = request.getServletContext();
    String ruta = servletContext.getRealPath("/WEB-INF/Promedios.txt");
    ruta = ruta.replace('\\','/');
    Archivo.add(alumno,ruta);
%>

<h2>Registro de dato correcto</h2>
<form action="index.jsp" method="post">
    <input type="submit" value="nuevo registro">
</form>

</body>
</html>
