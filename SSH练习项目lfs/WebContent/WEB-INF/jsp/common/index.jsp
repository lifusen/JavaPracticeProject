<%@ page language="java"  pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="/lfs/css/bootstrap.min.css">  
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="/lfs/js/bootstrap.min.js"></script>
<title>主页显示1111</title>
</head>
<body>
<div style="width:1000px;margin:0 auto">
<br />
<%@include file="../common/title.jsp"%>

<div id="myCarousel" class="carousel slide">
    <!-- 轮播（Carousel）指标 -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>   
    <!-- 轮播（Carousel）项目 -->
    <div class="carousel-inner">
        <div class="item active">
            <a href="http://bns.qq.com"><img src="/lfs/photos/1.jpg" alt="First slide" style="width:100%;"></a>
        </div>
        <div class="item">
            <a href="http://cf.qq.com"><img src="/lfs/photos/2.jpg" alt="Second slide" style="width:100%;"></a>
        </div>
        <div class="item">
            <a href="http://cf.qq.com"><img src="/lfs/photos/3.jpg" alt="Third slide" style="width:100%;"></a>
        </div>
    </div>
    <!-- 轮播（Carousel）导航 -->
    <a class="carousel-control left" href="#myCarousel" 
       data-slide="prev">&lsaquo;</a>
    <a class="carousel-control right" href="#myCarousel" 
       data-slide="next">&rsaquo;</a>
</div><br />
<%-- 
	<div style="float:left; width:680px;"  class="text-muted">
		<h4>最新发表</h4>
		<div style="float:left;"><label style="width:450px"><a>111111111111111111111</a></label>
		<label>张志强-2017年01月01日</label></div>
		<div style="float:left;"><label style="width:450px"><a>111111111111111111111</a></label>
			<label>张志强-2017年01月01日</label></div>
		<div style="float:left;"><label style="width:450px"><a>111111111111111111111</a></label>
		<label>张志强-2017年01月01日</label></div>
	</div>
	<div style="float:right;width:200px;">
		<h4>管理资源</h4>
		<div><label><a>管理员网盘</a></label></div>
		<div><label><a>管理员电影</a></label></div>
		<div><label><a>管理员音乐</a></label></div>
	</div>
	--%>
	<video width="100%" controls autoplay>
	<source src="/lfs/video/23.mkv" type="video/mp4">
	</video>
	<div style="margin:0 auto">
	<b>注意：战狼2视频是mkv格式，有的浏览器或者手机浏览器加载不出来或者播放卡</b><br>
	<b>建议点击下面图片下载观看，下载一定不能中断，可以在后台下载一共2.76G（720P画质）</b><br>
	<b>更高画质，我还没找到。。。账户密码是：lifusen 123456 只要电脑没关，服务器就会一直运行</b><br>
	<a href="/lfs/hero/download1?src=/video/23.mkv&name=zhanlang2.MP4">
		<img src="/lfs/photos/zl2.jpg" alt="Third slide" style="width:30%;">
	</a></div>
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