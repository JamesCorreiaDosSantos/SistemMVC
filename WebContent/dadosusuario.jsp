<%@page import="br.com.modelo.Usuario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dados do Usuário</title>
</head>
<body>

	<h1>Alterar Dados do Usuário</h1>
	
<% Usuario usuario = (Usuario)request.getAttribute("usuarioDoBanco");%>
	
	<form method="post" action= "alterarusuario">
		Id: <input type="text" name="txtid" value="<%=usuario.getId() %>" readonly="readonly"><br><br>
		Nome: <input type="text" name="txtnome" value="<%=usuario.getNome() %>"><br><br>
		Login: <input type="text" name="txtlogin" value="<%=usuario.getLogin() %>"><br><br>
		Senha: <input type="password" name="txtsenha" value="<%=usuario.getSenha() %>"><br><br>
		<input type="submit" value="Salvar Usuário">
	
	</form>


</body>
</html>