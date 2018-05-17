<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="/lfs1/css/bootstrap.min.css">  
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="/lfs1/js/bootstrap.min.js"></script>
<title>用户登陆页面</title>
</head>
<body>

<form role="form" style="width:400px;margin:0 auto" method="post" action="${pageContext.request.contextPath }/user/userLogin">
	<%@include file="../common/title.jsp"%>
	<h3>用户登陆页面</h3><br />
	
	<div class="form-group">
		<label for="inputname1" >账户</label>
		<input class="form-control" type="text" id="inputname1" placeholder="请输入名字" name="loginname" value="${tblUser.loginname }">
	</div>
	<div class="form-group">
		<label for="inputname2" >密码</label>
		<input class="form-control" type="password" id="inputname2" placeholder="请输入密码" name="loginpwd" value="${tblUser.loginpwd }">
  	</div>
  	
  <button type="submit" class="btn btn-default" style="float:right">登陆</button><label style="color:blue">${loginTip }${authTip }</label>
</form>
</body>
</html>
<script>
	$(function(){
		
	})
</script>