<!DOCTYPE html>
<html>
<body>
<font color="red">${errorMessage}</font>
<form name="loginForm" action="/login" method="post" onsubmit="return validateForm();">
UserName:<input type="text" name="username"/><br>
Password:<input type="password" name="password"/>
<input type="submit">
</form>
<script type="text/javascript" src="/js/login.js"></script>
</body>
</html>