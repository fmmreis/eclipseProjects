<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input tutorial</title>
</head>
<body>

	<s:form action="tutorials/getTutorial">
		<s:textfield  key="language" label="Input language"></s:textfield>
		<s:submit label="submit" />
	</s:form>

<!-- 	<form method="post" action="tutorials/getTutorial.action"> -->
<!-- 		<input name="language"> -->
<!-- 		<input type="submit"/> -->
<!-- 	</form> -->
	
</body>
</html>