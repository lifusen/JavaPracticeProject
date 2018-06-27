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
<title>主页显示</title>
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
            <a href="http://bns.qq.com"><img src="/lfs1/photos/1.jpg" alt="First slide" style="width:100%;"></a>
        </div>
        <div class="item">
            <a href="http://cf.qq.com"><img src="/lfs1/photos/2.jpg" alt="Second slide" style="width:100%;"></a>
        </div>
        <div class="item">
            <a href="http://cf.qq.com"><img src="/lfs1/photos/3.jpg" alt="Third slide" style="width:100%;"></a>
        </div>
    </div>
    <!-- 轮播（Carousel）导航 -->
    <a class="carousel-control left" href="#myCarousel" 
       data-slide="prev">&lsaquo;</a>
    <a class="carousel-control right" href="#myCarousel" 
       data-slide="next">&rsaquo;</a>
</div><br />

	<video width="100%" controls autoplay>
	<source src="/lfs/video/23.mkv" type="video/mp4">
	</video>
	<div style="margin:0 auto">
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