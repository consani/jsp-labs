<%@page session="true"  errorPage="error.jsp" language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%-- For�ando um ArithmeticException para ser capturado pela p�gina de erro --%>
	<% 
		session.setAttribute("teste","Testando a sess�o");
		int i = 10/0;
		out.println("Valor de i = " + i);
	%>

</body>
</html>