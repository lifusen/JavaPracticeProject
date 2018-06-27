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
<form role="form" style="width:400px;margin:0 auto" action="${pageContext.request.contextPath }/user/userRegist" method="post">
	<%@include file="../common/title.jsp"%>
	<h3>新用户注册页面</h3><br />
	<div class="form-group">
		<label for="inputname0" >姓名</label>
		<input class="form-control" type="text" id="inputname0" placeholder="请输入名字" name="name" value="${user.name }">
	</div>
	<div class="form-group">
		<label for="inputname1" >账户</label>
		<input class="form-control" type="text" id="inputname1" placeholder="请输入账户" name="loginname" value="${user.loginname }">
		<p id="ccc" style="color:green"></p><form:errors path="loginname" cssClass="error" />   
	</div>
	<div class="form-group">
		<label for="inputname2" >密码</label>
		<input class="form-control" type="password" id="inputname2" placeholder="请输入密码" name="loginpwd" value="${user.loginpwd }">
  		<form:errors path="password" cssClass="error" />   
  	</div>
  	<div class="form-group">
		<label for="inputname3" >年龄</label>
		<input class="form-control" type="text" id="inputname3" placeholder="请输入年龄" name="age" value="${user.age }">
  	</div>
  	<div class="form-group">
		<label for="inputname4" >邮箱</label>
		<input class="form-control" type="text" id="inputname4" placeholder="请输入邮箱" name="email" value="${user.email }">
  	</div>
  	<div class="form-group">
		<label for="inputname5" >地址</label>
		<input class="form-control" type="text" id="inputname5" placeholder="请输入地址" name="address" value="${user.address }">
  	</div>
  	 <div class="form-group">
		<label for="inputname6" >电话</label>
		<input class="form-control" type="text" id="inputname6" placeholder="请输入电话" name="number" value="${phone.number }">
  	</div>
  	    <label for="name">身份</label>
    <select class="form-control" name="positionid">
      <option value="1">管理员</option>
      <option value="2">新用户</option>
    </select><br />
  <button type="submit" class="btn btn-default" style="float:right">注册</button><p>${registTip }</p>
</form>
</body>
</html>
<script>
	$(function(){
		$("#inputname1").bind("change keyup",function(){
			$.ajax({
				type:"post",
				url:"/lfs1/user/useryan",
				data:{loginName:$("#inputname1").val()},
				dataType:"json",
				success:function(data){
					$("#ccc").text(data.ccc);
				}
			});
			<%--$.post("/lfs/user/useryan",{user.loginName:$("#inputname1").val()}, function(data){
			alert(data);
				$("#ccc").text(data);
		
			});--%>
		})
	})
</script>