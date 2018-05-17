<%@ page language="java"  pageEncoding="utf-8"%>
<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
	<div>
		<ul class="nav navbar-nav">
			<li><a href="/lfs1/hero/heroRegistForm">LOL英雄录入</a></li>
			<li><a href="/lfs1/hero/heroLoginForm">LOL英雄查看</a></li>
			<li><a href="/lfs1/sayc/saycRegistForm">LOL论坛中心</a></li>
			<li><a >   </a></li>	
			<li id="wea"><a>天气详情</a></li>
	    	<li id="time"><a></a></li>
	    </ul>
	</div>
	<c:if test="${curUser==null }">
	  <ul class="nav navbar-nav navbar-right">
      <li><a href="/lfs1/user/userRegistForm"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
      <li><a href="/lfs1/user/userLoginForm"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
    </ul>
    </c:if>
    <c:if test="${curUser!=null }">
	  <ul class="nav navbar-nav navbar-right">
      <li><a >欢迎回来,${curUser.name}&nbsp;&nbsp;</a></li>
       <li><a href="${pageContext.request.contextPath }/user/userLoginOut">注销</a></li>
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