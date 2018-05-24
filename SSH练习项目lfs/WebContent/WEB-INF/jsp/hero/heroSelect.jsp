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
<title>文章修改</title>
</head>
<body>
<div style="width:1000px;margin:0 auto">
<br />
<%@include file="../common/title.jsp"%>
<form role="form" style="width:400px;margin:0 auto" action="/lfs/hero/heroUpdate" method="post" enctype="multipart/form-data">
	<s:debug />	
	<h3>文章修改</h3><br />
	
	<c:forEach items="${list }" var="hero">
	<input type = "hidden" name ="hero.id" value ="${hero.id }">
	
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
  <button type="submit" class="btn btn-default" style="float:right">修改提交</button><p>${registTip }</p>
  </c:forEach>
</form>
</div>
</body>
</html>
<script>
		$(function(){
		$('#myCarousel').carousel('cycle');
		myTimer();
		 $("#weather").hide();
		setInterval(function(){myTimer()},1000);

		function myTimer()
		{
		var d=new Date();
		var str = "" + d.getFullYear() + "年";
		str += (d.getMonth()+1) + "月";
		str += d.getDate() + "日";
		var t=d.toLocaleTimeString();
		$("#time a").html(str+t);
		}
		
		$("#wea").mouseover(function(){
			  $("#weather").show();
			});
		$("#wea").mouseout(function(){
			  $("#weather").hide();
			});
	})
</script>