<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="/lfs/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="/lfs/js/bootstrap.min.js"></script>
<title>言论发表页面</title>
</head>
<body>
	<div style="width:1000px;margin:0 auto">
<br />
<%@include file="../common/title.jsp"%>
	<form role="form" style="width:800px;margin:0 auto"
		action="/lfs/sayc/saycLogin" method="post">
		
		<h3>言论发表页面</h3>
		<br />
		<div class="form-group">
			<c:forEach items="${says }" var="x">
				<p>${x.name }说：${x.instruction }</p>
			</c:forEach>
		</div>
		<div style="position:fixed;bottom:0px;width:800px">
			<input type="hidden" name="sayc.name" value="${user.name }">
				<div class="form-group">
			<textarea class="form-control" id="inputname6" placeholder="说明" style="width:100%"
				name="sayc.instruction"  >
			</textarea>		
			<button type="submit" class="btn btn-default" style="float:right">发表</button>
			
		</div>
	</form>
</div>
</body>
</html>
<script>	$(function(){
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
	})$(function() {})
</script>