<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비트로또</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<div>
    <h2>환영합니다</h2>
   	<table border = '1'>
   		<tr>
   			<td>로그인</td>
   			<td><input id = "btn" type="button"value = "LOGIN" /></td>
   		</tr>
   		<tr>
   			<td>회원가입</td>
   			<td><a id = "a_register" href="#">바로가기</a></td>
   		</tr>
   		<tr>
   			<td>로또</td>
   			<td><a id  = "lotto" href= "#" > 바로가기</a>a</td>
   		</tr>
   	</table>
</div>
<script>
$('#btn').click(function() {
	alert('버튼클릭');
	location.assign('<%=request.getContextPath()%>/consumer.do?action=move&dest=login');
	
});
$('#a_register').click(function() {
	alert('바로가즈아');
	location.assign('<%=request.getContextPath()%>/consumer.do?action=move&dest=join');
});
$('#lotto').click(function() {
	alert('로또');
	location.assign('<%=request.getContextPath()%>/lotto.do?action=move&dest=buy');
});
</script>
</body>
</html>