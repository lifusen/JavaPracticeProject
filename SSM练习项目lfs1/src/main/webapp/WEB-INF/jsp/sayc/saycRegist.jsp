<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="/lfs1/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="/lfs1/js/bootstrap.min.js"></script>
<title>言论发表页面</title>
</head>
<body>
	
	<form role="form" style="width:800px;margin:0 auto"
		action="/lfs1/sayc/saycLogin" method="post">
		<%@include file="../common/title.jsp"%>
		<h3>言论发表页面</h3>
		<br />
		<div class="form-group">
			<c:forEach items="${saycs }" var="x">
				<p>${x.name }说：${x.instruction }</p>
			</c:forEach>
		</div>
		<div style="position:fixed;bottom:0px;width:800px">
			<input type="hidden" name="name" value="${curUser.name }">
				<div class="form-group">
			<textarea class="form-control" id="inputname6" placeholder="说明" style="width:100%"
				name="instruction"  >
			</textarea>		
			<button type="submit" class="btn btn-default" style="float:right">发表</button>
			
		</div>
	</form>

</body>
</html>
<script>
	$(function() {})
</script>