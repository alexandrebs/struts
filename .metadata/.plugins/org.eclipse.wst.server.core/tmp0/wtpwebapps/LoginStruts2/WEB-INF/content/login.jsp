<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<title><s:property value="formTitulo" /></title>
</head>
<body>
	<h3>
		<s:property value="formTitulo" />
	</h3>
	<s:form>

		<s:textfield key="form.usuario" name="usuario" />
		<s:password key="form.password" name="password" />
		<s:submit key="form.boton" name="submit" />

	</s:form>

	<br />
	<br />

	<div>
		<s:text name="form.valores"></s:text> <br />
		<s:property value="formUsuario" /> 	<s:property value="usuario" /><br />
		<s:property value="formPassword" /> <s:property value="password" />

	</div>
</body>
</html>