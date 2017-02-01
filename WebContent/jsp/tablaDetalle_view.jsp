<%@page import="modelo.entidades.Persona"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet"%>

<%
	Persona p = (Persona) request.getAttribute("persona");
%>


<table>
  <tr>
    <th>Nombre</th>
    <th>Dni</th>
    <th>Telefono</th>
    <th>Edad</th>
  </tr>
  <tr>
    <td><%=p.getNombre() %></td>
    <td><%=p.getDni() %></td>
    <td><%=p.getTelefono() %></td>
    <td><%=p.getEdad() %></td>
  </tr>
</table>

<a href="<portlet:actionURL/>">Volver</a>
