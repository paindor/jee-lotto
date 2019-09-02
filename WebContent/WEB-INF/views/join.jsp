<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lotto.lotto</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<body>
<h1>회원가입</h1>
<form id = "join" action= "<%=request.getContextPath() %>/Consumer.do">
	아이디:<input type="text" name = "cid" />
	비밀번호:<input type="text" name = "pw"/>
	<input type="submit" value = "전송" />
	
</form>
<script>
$('#join').submit(function() {
	
	alert('됐다');
	
});
</script>
</body>
</html>