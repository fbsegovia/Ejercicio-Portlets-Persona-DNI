<%@page import="modelo.entidades.Persona"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/portlet" prefix="portlet"%>
<!-- Comentario -->
<%
	List<Persona> listaPersonas = (List<Persona>) request.getAttribute("listaPersonas");
%>
<table>
  <tr>
    <th>Nombre</th>
    <th>DNI</th>
    <th>Detalle</th>
  </tr>
  <% for(Persona p : listaPersonas){ %>
  <tr>
    <td><%=p.getNombre() %></td>
    <td><%=p.getDni() %></td>
    <td><a href="<portlet:actionURL/>?dni=<%=p.getDni()%>">Detalles</a></td>
  </tr>
  <% } %>
</table>

