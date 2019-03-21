<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Processamento do formulário 1</title>
</head>
<body>
	<h1> Dados do Usuário </h1>
	<h3>	
		Nome:  ${bean.nome}  <br>
		Login: ${bean.login} <br>
		Senha: ${bean.senha} <br>
	</h3>
	<jsp:useBean id="usuario" class="br.com.impacta.UsuarioBean"/>
	
	<h1> Dados do Usuário 2 </h1>
	<h3>	
		Nome2:  ${usuario.nome}  <br>
		Login2: ${usuario.login} <br>
		Senha2: ${usuario.senha} <br>
	</h3>
	<h1> Exibindo a data/hora corrente</h1>
	
	<h4>
	<jsp:useBean id="agora" class="java.util.Date"/>
	<br>
	Versão Curta: <fmt:formatDate value="${agora}" />
	<br>
	Versão Longa: <fmt:formatDate value="${agora}" dateStyle="full"/>
	</h4>
		

</body>
</html>