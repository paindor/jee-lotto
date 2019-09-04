<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<meta charset="UTF-8">
<title>로또 프로그램</title>
</head>
<body>
<form id = "buy" action="<%=request.getContextPath() %>/lotto.do">
	입금액<input type="text"name = "money" value = "1000"/>
	<input type="hidden" name = "action" value = "buy"  />
	<input type="submit" value = "로또번호행성"/>
</form>
<script>
$('#lotto').submit(function () {
	alert('로또생성');
});
</script>
</body>
</html>