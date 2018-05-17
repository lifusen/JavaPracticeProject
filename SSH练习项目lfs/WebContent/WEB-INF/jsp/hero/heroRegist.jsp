<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="/lfs/css/bootstrap.min.css">  
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="/lfs/js/bootstrap.min.js"></script>
<title>文章编辑</title>
</head>
<body>

<form role="form" style="width:400px;margin:0 auto" action="/lfs/hero/heroRegist" method="post" enctype="multipart/form-data">
	<%@include file="../common/title.jsp"%>
	<h3>文章编辑</h3><br />
	<div class="form-group">
		<label for="inputname0" >标题</label>
		<input class="form-control" type="text" id="inputname0" placeholder="请输入名字" name="hero.name" value="${hero.name }">
		<s:property value="[1].fieldErrors['hero.name'][0]"/>
	</div>
	<div class="form-group">
		<label for="inputname0" >标签</label>
		<input class="form-control" type="text" id="inputname1" placeholder="请输入名字" name="hero.category" value="${hero.category }">
		<s:property value="[1].fieldErrors['hero.category'][0]"/>
	</div>
  	<%--<div class="form-group">
		<label for="inputname5" >头像</label>
		<input  type="file" id="inputname5"  name="file1" >
  	</div> --%>
  	 <div class="form-group">
		<label for="inputname6" >内容</label>
		<textarea  class="form-control" id="inputname6" placeholder="说明" name="hero.instruction" value="${hero.instruction}">
		</textarea>
		<s:property value="[1].fieldErrors['hero.instruction'][0]"/>
  	</div>
  <button type="submit" class="btn btn-default" style="float:right">提交</button><p>${registTip }</p>
</form>
</body>
</html>
<script>
	$(function(){
		
	})
</script>