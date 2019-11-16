<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="loginAction">
		<s:textfield  key="loginID" label="Login ID"></s:textfield>
		<s:password key="password" label="Password"></s:password>
		<s:submit label="submit" />
	</s:form>
</body>
</html>