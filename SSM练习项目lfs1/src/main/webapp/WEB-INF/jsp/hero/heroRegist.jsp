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
<title>用户注册页面</title>
</head>
<body>

<form role="form" style="width:400px;margin:0 auto" action="/lfs1/hero/heroRegist" method="post" enctype="multipart/form-data">
	<%@include file="../common/title.jsp"%>
	<h3>英雄注册页面</h3><br />
	<div class="form-group">
		<label for="inputname0" >姓名</label>
		<input class="form-control" type="text" id="inputname0" placeholder="请输入名字" name="name" value="${hero.name }">
		
	</div>
  	<div class="form-group">
		<label for="inputname5" >头像</label>
		<input  type="file" id="inputname5"  name="file" >
  	</div>
  	 <div class="form-group">
		<label for="inputname6" >说明</label>
		<textarea  class="form-control" id="inputname6" placeholder="说明" name="instruction" value="${hero.instruction}">
		</textarea>
		
  	</div>
  <button type="submit" class="btn btn-default" style="float:right">注册</button><p>${registTip }</p>
</form>
</body>
</html>
<script>
	$(function(){
		
	})
</script>