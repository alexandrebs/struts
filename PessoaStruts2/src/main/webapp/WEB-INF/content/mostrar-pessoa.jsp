<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>

<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
		<head>
			<title>Mostar pessoa com Struts 2</title>
		</head>
		<body>
		<h3>Informe seu nome:</h3>
				<s:form>
				
					<s:textfield name="nome"/>
					<s:submit value="enviar"/>
				
				</s:form>
		
				<div>
					<h3>Nome proporcionado:</h3> <s:property value="nome"/>
				</div>
		
		</body>
</html>