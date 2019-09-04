<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로또로또</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>

<body>
<div>
	<form  id = "login" action= '<%=request.getContextPath()%>/consumer.do'>
	아이디<input type="text"  name = "id"  /><br />
	비밀번호<input type="password" name = "password" /><br />
	<input type="hidden" name = "action" value = "login" /><br />
	<input type="hidden" name = "dest"  value = "buy"/>
		<input type="submit" value = "전송" />
	
	
	</form>

</div>
<script>
$('#login').submit(function () {
	alert('로그인확인');
});
</script>
</body>
</html>