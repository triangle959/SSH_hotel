<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

    <title>login</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
	<!-- Custom Theme files -->
	<link href="css/style.css" rel='stylesheet' type='text/css' />	
	<link href="css/loginPage.css" rel='stylesheet' type='text/css' />	
	<script src="js/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript" src="js/loginPage.js"></script>
	</head>
	<body>
	<!-- banner -->
		<div class="banner1">
			<div class="header">
				<div class="container">
					<div class="logo">
						<h1><a href="index.jsp">Motel</a></h1>
					</div>
						<nav class="navbar navbar-default" role="navigation">
							<!--/.navbar-header-->
							<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
								<ul class="nav navbar-nav">
									<li><a href="index.jsp">主页</a></li>
									<li><a href="roomdetail.jsp">房间介绍</a></li>
									<li><a href="login.jsp">登录</a></li>
	
								</ul>
							</div>
							<!--/.navbar-collapse-->
						</nav>
						<div class="clearfix"> </div>
				</div>
			</div>
		</div>		
			<!-- banner -->
	
	<div class="login-page">
			<div class="container">
				<div class="account_grid">
				   <div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s">
						<h3>登录 &nbsp;/&nbsp;<a href="register.jsp">注册</a></h3>	
						<form action="userAction!loginUser" method="post" id="loginForm">
						<span id="errorPrompt">用户名或密码错误！</span>
							<div>
								<span>用户名<label>*</label></span>
								<input name="user.username" type="text" class="type-text" > 
							</div>
							<div>
								<span>密码<label>*</label></span>
								<input name="user.password"type="password" class="type-text"> 
							</div>
							<a class="forgot" href="#">Forgot Your Password?</a>
							<input id="loginSubmit" type="submit" value="登录">
							<a href="admin/adminlogin.jsp">admin登录</a>
						</form>
				   </div>	
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
	<%@include file="footer.jsp" %>
</body>
</html>