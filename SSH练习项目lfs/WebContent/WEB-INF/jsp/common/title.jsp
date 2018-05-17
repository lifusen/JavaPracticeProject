<%@ page language="java"  pageEncoding="utf-8"%>
<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
	<div>
		<ul class="nav navbar-nav">
			<li><a href="/lfs/hero/heroRegistForm">文章录入</a></li>
			<li><a href="/lfs/hero/heroLogin">文章查看</a></li>
			<li><a href="/lfs/sayc/saycRegist">论坛中心</a></li>
			<li><a >   </a></li>	
			<li id="wea"><a>天气详情</a></li>
	    	<li id="time"><a></a></li>
	    </ul>
	</div>
	<c:if test="${curuser==null }">
	  <ul class="nav navbar-nav navbar-right">
      <li><a href="/lfs/user/userRegistForm"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
      <li><a href="/lfs/user/userLoginForm"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
    </ul>
    </c:if>
    <c:if test="${curuser!=null }">
	  <ul class="nav navbar-nav navbar-right">
      <li><a >欢迎回来,${curuser.name}&nbsp;&nbsp;</a></li>
       <li><a href="/lfs/user/userLoginOut">注销</a></li>
    </ul>
    </c:if>
	</div>
</nav>
<c:if test="${weather!=null }">
<div style="position:relative"  id="weather">
	<c:forEach items="${weather }" var="x">
		<label>${x }</label>
	</c:forEach>
</div>
</c:if>