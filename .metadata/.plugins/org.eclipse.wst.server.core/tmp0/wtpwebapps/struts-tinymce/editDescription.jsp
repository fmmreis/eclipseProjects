<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<script src="tinymce/js/tinymce/tinymce.min.js" referrerpolicy="origin"></script>

<script>
	tinymce
			.init({
				selector : 'textarea',
			    width: 1200,
			    height: 300,
			    plugins: [
			        'advlist autolink link image lists charmap print preview hr anchor pagebreak spellchecker',
			        'searchreplace wordcount visualblocks visualchars code fullscreen insertdatetime media nonbreaking',
			        'save table directionality emoticons template paste'
			      ],
			      content_css: 'css/content.css',
			      toolbar: 'insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image | print preview media fullpage | forecolor backcolor emoticons'
				
			});
</script>
<meta charset="UTF-8">
<!-- <meta http-equiv="Content-Security-Policy" content="default-src 'none'; script-src 'self' *.tinymce.com *.tiny.cloud; connect-src 'self' *.tinymce.com *.tiny.cloud; img-src 'self' *.tinymce.com *.tiny.cloud data: blob:; style-src 'self' 'unsafe-inline' *.tinymce.com *.tiny.cloud; font-src 'self' *.tinymce.com *.tiny.cloud;" /> -->
<!-- <meta http-equiv="Content-Security-Policy" content="default-src 'none'; script-src 'self'; connect-src 'self'; img-src 'self' data: blob:; style-src 'self' 'unsafe-inline'; font-src 'self';" /> -->

<title>TinyMCE</title>
</head>
<body>
	<s:form action="saveAction">
		<h1>Welcome to tinyMCE</h1>
		<h2>Description</h2>
		<s:textarea key="description" />
		<s:submit />
	</s:form>
</body>
</html>
