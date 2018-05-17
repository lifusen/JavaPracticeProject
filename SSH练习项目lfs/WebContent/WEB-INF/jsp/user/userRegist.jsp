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
<title>用户注册页面</title>
</head>
<body>

<form role="form" style="width:400px;margin:0 auto" action="/lfs/user/userRegist" method="post">
	<%@include file="../common/title.jsp"%>
	<h3>新用户注册页面</h3><br />
	<div class="form-group">
		<label for="inputname0" >姓名</label>
		<input class="form-control" type="text" id="inputname0" placeholder="请输入名字" name="user.name" value="${user.name }">
		<s:property value="[0].fieldErrors['user.name'][0]" />
	</div>
	<div class="form-group">
		<label for="inputname1" >账户</label>
		<input class="form-control" type="text" id="inputname1" placeholder="请输入账户" name="user.loginName" value="${user.loginName }">
		<s:property value="[0].fieldErrors['user.loginName'][0]" />
		<p id="ccc" style="color:green"></p>
	</div>
	<div class="form-group">
		<label for="inputname2" >密码</label>
		<input class="form-control" type="password" id="inputname2" placeholder="请输入密码" name="user.loginPwd" value="${user.loginPwd }">
  		<s:property value="[0].fieldErrors['user.loginPwd'][0]" />
  	</div>
  	<div class="form-group">
		<label for="inputname3" >年龄</label>
		<input class="form-control" type="text" id="inputname3" placeholder="请输入年龄" name="user.age" value="${user.age }">
  		<s:property value="[0].fieldErrors['user.age'][0]" />
  	</div>
  	<div class="form-group">
		<label for="inputname4" >邮箱</label>
		<input class="form-control" type="text" id="inputname4" placeholder="请输入邮箱" name="user.email" value="${user.email }">
  		<s:property value="[0].fieldErrors['user.email'][0]" />
  	</div>
  	<div class="form-group">
		<label for="inputname5" >地址</label>
		<input class="form-control" type="text" id="inputname5" placeholder="请输入地址" name="user.address" value="${user.address }">
  		<s:property value="[0].fieldErrors['user.address'][0]" />
  	</div>
  	 <div class="form-group">
		<label for="inputname6" >电话</label>
		<input class="form-control" type="text" id="inputname6" placeholder="请输入电话" name="user.tel_list[0].number" value="${user.tel_list[0].number }">
  		<s:property value="[0].fieldErrors['user.tel_list[0].number'][0]" />
  	</div>
  	    <label for="name">身份</label>
    <select class="form-control" name="user.positionid">
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
				url:"/lfs/user/useryan",
				data:{loginName:$("#inputname1").val()},
				dataType:"json",
				success:function(data){
					$("#ccc").text(data);
				}
			});
			<%--$.post("/lfs/user/useryan",{user.loginName:$("#inputname1").val()}, function(data){
			alert(data);
				$("#ccc").text(data);
		
			});--%>
		})
	})
</script>