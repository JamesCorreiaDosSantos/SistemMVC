<%@page import="br.com.modelo.Usuario"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mostrar Usuarios</title>
</head>
<body>

<h1>Lista de Usuarios</h1>

<a href="Cadastrar.html"><button> Cadastrar Usuario</button></a>

<%

List<Usuario> usuarios =(List<Usuario>)request.getAttribute("listaDeUsuarios");

%>

<table border="1" style="width:80%">

	<thead>
		<tr bgcolor="black" style="color:white">
			<th>id</th>
			<th>nome</th>
			<th>login</th>
			<th>senha</th>
			<th colspan="2">Ação</th>
		<tr>
	</thead>

	<tbody>
		<%for(Usuario usuario:usuarios){ %>
		<tr bgcolor="7B68EE" style="color: #FFFF00">
			<td><%=usuario.getId() %></td>
			<td><%=usuario.getNome() %></td>
			<td><%=usuario.getLogin() %></td>
			<td><%=usuario.getSenha() %></td>
			<td><a href="alterarusuario?id=<%=usuario.getId() %>">Alterar</a></td>
			<td><a href="excluirusuario?id=<%=usuario.getId() %>">Excluir</a></td>	
		<tr>
		<%} %>
	</tbody>

</table>

</body>
</html>