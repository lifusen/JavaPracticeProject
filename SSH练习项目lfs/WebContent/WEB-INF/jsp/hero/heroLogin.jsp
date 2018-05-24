<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="/lfs/css/bootstrap.min.css">  
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="/lfs/js/bootstrap.min.js"></script>
<title>文章查看</title>
</head>
<body>
<div style="width:1000px;margin:0 auto">
<br />
<%@include file="../common/title.jsp"%>
<form role="form" style="width:600px;margin:0 auto" action="/lfs/hero/heroRegist" method="post" enctype="multipart/form-data">
	<s:property value="[1].fieldErrors" />
	<h3>查看页面</h3><br />
	<c:forEach items="${list }" var="hero">
		<div style="margin:0 auto">
			<label>编号：${hero.id }</label><br />
			<label>名字：${hero.name }</label><br />
			<label>内容：${hero.instruction }</label><br />
			<!-- 图片：<img src="/lfs${hero.src_photo }" style="width:300px;height:200px"/>
			<br /><a href="/lfs/hero/download?src=${hero.src_photo }&name=${hero.name }">下载原图</a> -->
			<label>标签：${hero.category }</label> <a href ="/lfs/hero/heroSelect?scc=${hero.id }">修改</a>
		</div><br/><br />
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