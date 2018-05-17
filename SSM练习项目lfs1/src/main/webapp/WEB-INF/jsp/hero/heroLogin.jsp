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
<title>英雄查看页面</title>
</head>
<body>

<form role="form" style="width:600px;margin:0 auto" action="/lfs/hero/heroRegist" method="post" enctype="multipart/form-data">
	<%@include file="../common/title.jsp"%>
	<h3>英雄查看页面</h3><br />
	<c:forEach items="${list }" var="hero">
		<div style="margin:0 auto">
			<label>名字：${hero.name }</label><br />
			<label>介绍：${hero.instruction }</label><br />
			图片：<img src="/lfs1${hero.srcPhoto }" style="width:300px;height:200px"/>
			<br /><a href="/lfs1/hero/download?src=${hero.srcPhoto }&name=${hero.name }">下载原图</a>
		</div><br/><br />
	</c:forEach>
  
</form>
</body>
</html>
<script>
	$(function(){
		
	})
</script>