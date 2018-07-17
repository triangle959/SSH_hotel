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
	<link href="css/register.css" rel='stylesheet' type='text/css' />
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
	
				
			<div class="container">
				<div class="account_grid">
				   <div class="col-md-6 login-right wow fadeInRight" data-wow-delay="0.4s">
						<h3>登录 &nbsp;</h3><h3>/&nbsp;<a href="register.jsp">注册</a></h3>	
						<form action="userAction!registerUser" method="post" id="loginForm">
						<table>
							<tr>
								<td class="reg-col-1 fl"> 登录账号： </td>
								<td class="reg-col-2 fl"><input name="username" id="account" type="text">
									
							<tr>						
							<tr>
								<td class="reg-col-1 fl"> 登录密码： </td>
								<td class="reg-col-2 fl"><input name="password" id="password" type="password" >
									
							<tr>
							<tr>
								<td class="reg-col-1 fl"> 确认密码： </td>
								<td class="reg-col-2 fl"><input name="confirmPwd" id="confirmPwd" type="password" >
									
							<tr>
							<tr>
								<td class="reg-col-1 fl"> 真实姓名： </td>
								<td class="reg-col-2 fl"><input name="name" id="name" type="text">
									
							<tr>						
							<tr>
								<td class="reg-col-1 fl"> 电子邮箱： </td>
								<td class="reg-col-2 fl"><input name="email" id="email" type="text">
									
							<tr>
							<tr>
								<td class="reg-col-1 fl"> 手机号码： </td>
								<td class="reg-col-2 fl"><input name="mobile" id="mobile" type="text">
									
							<tr>
								<tr>

									<td class="btn-wrp">
										<button type="submit" id="registerBtn">注册</button>
									</td>
								<tr>
					   </table>

						</form>
                 
				   </div>	
				
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
	<%@include file="footer.jsp" %>
</body>
</html>

