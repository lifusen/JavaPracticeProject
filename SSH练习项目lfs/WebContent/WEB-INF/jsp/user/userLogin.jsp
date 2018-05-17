<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="/lfs/css/bootstrap.min.css">  
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="/lfs/js/bootstrap.min.js"></script>
<title>用户登陆页面</title>
</head>
<body>

<form role="form" style="width:400px;margin:0 auto" method="post" action="/lfs/user/userLogin">
	<%@include file="../common/title.jsp"%>
	<h3>用户登陆页面</h3><br />
	
	<div class="form-group">
		<label for="inputname1" >账户</label>
		<input class="form-control" type="text" id="inputname1" placeholder="请输入名字" name="user.loginName" value="${user.loginName }">
		<s:property value="[1].fieldErrors['user.loginName'][0]" />
	</div>
	<div class="form-group">
		<label for="inputname2" >密码</label>
		<input class="form-control" type="password" id="inputname2" placeholder="请输入密码" name="user.loginPwd" value="${user.loginPwd }">
  		<s:property value="[1].fieldErrors['user.loginPwd'][0]" />
  	</div>
  	
  <button type="submit" class="btn btn-default" style="float:right">登陆</button><label style="color:blue">${loginTip }${authTip }</label>
</form>
</body>
</html>
<script>
	$(function(){
		
	})
</script>