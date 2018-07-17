<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>主页</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
	<!-- Custom Theme files -->
	<link href="css/style.css" rel='stylesheet' type='text/css' />	
	<link rel="stylesheet" type='text/css' href="css/jquery-ui.css" />
	<script src="js/jquery-ui.js"></script>
	<script src="js/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	

	 <c:set var="userName" value=""/>
	 <c:if test="${!empty sessionScope.userName }">
	 <c:set var="userName" value="${sessionScope.userName}"/>
	 </c:if>

  </head>
	<body>
	<!-- banner -->
		<div class="banner">
			<div class="header">
				<div class="container">
					<div class="logo">
						<h1><a href="index.jsp">Motel</a></h1>
					</div>
						<nav class="navbar navbar-default" role="navigation">
							<div class="navbar-header">
								<c:if test="${not empty user}">
								<h1>欢迎您<a href="userAction!loginOut">${user.username}</a></h1>
								</c:if>
								<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
									<span class="sr-only">Toggle navigation</span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
									<span class="icon-bar"></span>
								</button>
							</div>
							<!--/.navbar-header-->
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav">
									<c:if test="${empty user.username }">
									<li class="active"><a href="index.jsp">首页</a></li>
									</c:if>
									<li><a href="roomtypeAction!ListRoomtype">房间介绍</a></li>
									<c:if test="${empty user.username }">
									<li><a href="login.jsp">登录</a></li>
									</c:if>
									<c:if test="${!empty user.username }">
									<li><a href="userInfo.jsp">个人信息</a></li>
									<li><a href="orderAction!findByUser">订单信息</a></li>
									</c:if>
								</ul>
							</div>
							<!--/.navbar-collapse-->
						</nav>
				</div>
			</div>
			<div class="banner-info">
				<div class="container">
					<div class="details-1">
						<div class="col-md-10 dropdown-buttons">   
							<div class="col-md-3 dropdown-button">           			
								<div class="input-group">
									<input class="form-control has-dark-background" name="slider-name" id="slider-name" placeholder="Name" type="text" required>
								</div>
							</div>
							<!---strat-date-piker---->
								
								  <script>
										  $(function() {
											$( "#datepicker,#datepicker1" ).datepicker();
										  });
								  </script>
							<!---/End-date-piker---->
	
							<div class="col-md-3 dropdown-button">           			
								<div class="book_date">
									<form>
										<input class="date" id="datepicker" type="text" value="Check In" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Check In';}">
									</form>
								</div>		
							</div>
						  <div class="col-md-3 dropdown-button">           			
								<div class="book_date">
									<form>
										<input class="date1" id="datepicker1" type="text" value="Check Out" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Check Out';}">
									</form>
								</div>		
							</div>
							<div class="col-md-3 dropdown-button">
							  <div class="section_1">
								 <select id="country" onChange="change_country(this.value)" class="frm-field required">
									<option value="null">Double Room</option>
									<option value="null">Sigle Room</option>         
									<option value="AX">Suit Room</option>
									<option value="AX">Guest Room</option>
								 </select>
							  </div>
							</div>
							<div class="clearfix"> </div>
						</div> 
						<div class="col-md-2 submit_button"> 
							<form action="details.html">
								<input type="submit" value="Search">
							</form>
						</div>
						<div class="clearfix"> </div>
					</div>
				</div>
			</div>
		</div>		
		<!-- banner -->
		<!-- hod -->
		<div class="hod">
			<div class="container">
				<div class="col-md-6 hod-left">
					<img src="css/img/14.jpg" class="img-responsive" alt="">
				</div>
				<div class="col-md-6 hod-right">
					<h2>惊喜派对套房已经上线</h2>
					<p>100平米的宽敞空间，舒服的冷气，柔软的sofa，带上小伙伴来爽一夏吧！</p>
					<p>豪华的设施，带有高品质KTV设备，各种桌游设施，打街机，搓麻将，还有VR游戏等着你哦！</p>
					<a class="hvr-shutter-in-horizontal" href="roomdetail.jsp">立即预订</a>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<!-- hod -->
	    <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >企业网站模板</a></div>
		<!-- tels -->
		<div class="tels">
			<div class="container">
				<div class="col-md-4 tels-left">
					<h4>单人间 <span>110￥</span></h4>
					<img src="css/img/4.jpg" class="img-responsive" alt="">
					<p>房间介绍</p>
					<a class="hvr-shutter-in-horizontal" href="details.html">立即预订</a>
				</div>
				<div class="col-md-4 tels-left">
					<h4>双人间 <span>150￥</span></h4>
					<img src="css/img/9.jpg" class="img-responsive" alt="">
					<p>房间介绍</p>
					<a class="hvr-shutter-in-horizontal" href="details.html">立即预订</a>
				</div>
				<div class="col-md-4 tels-left">
					<h4>私人套房<span>200￥</span></h4>
					<img src="css/img/3.jpg" class="img-responsive" alt="">
					<p>房间介绍</p>
					<a class="hvr-shutter-in-horizontal" href="details.html">立即预订</a>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<!-- tels -->
		<!-- quick -->
		<div class="quick">
			<div class="container">
				<div class="col-md-4 quick-left">
					<h3>酒店设施</h3>
						<ul>
							<li><a href="#">——24小时热水</a></li>
							<li><a href="#">——免费Wi-Fi</a></li>
							<li><a href="#">——免费停车位</a></li>
						</ul>
				</div>
				<div class="col-md-4 quick-left">
					<h3>公告栏</h3>
					<div class="new">
						<div class="n-lft">
							<h5>10</h5>
							<h6>五月</h6>
						</div>
						<div class="n-rgt">
							<p>现推出惊喜派对系列房间，一晚仅需1080！！</p>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="col-md-4 quick-left">
					<h3>意见栏</h3>
						<form>
							<input type="text" class="textbox" value="Email" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Email';}">
							<textarea placeholder="" onFocus="this.value='';" onBlur="if (this.value == '') {this.value = '请写下您宝贵的意见';}">请写下您宝贵的意见</textarea>
							<input type="submit" value="提交">
						</form>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<!-- quick -->
<%@include file="footer.jsp"%>
	</body>
</html>