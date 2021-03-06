<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

    <title>个人信息</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
	<!-- Custom Theme files -->
	<link href="css/style.css" rel='stylesheet' type='text/css' />	
	<script src="js/jquery-1.11.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

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
									<c:if test="${!empty user.username}">
									<c:set var="userName" value="${user.username}"/>
										欢迎您${user.username}
									</c:if>
									<li><a href="index.jsp">主页</a></li>
	 								<c:if test="${empty user.username }">
									<li><a href="login.jsp">登录</a></li>
									</c:if>
									<c:if test="${!empty user.username}">
									<li><a href="roomdetail.jsp">房间信息</a></li>
									<li><a href="orderdetail.jsp">订单信息</a></li>
									</c:if>
								</ul>
							</div>
							<!--/.navbar-collapse-->
						</nav>
						<div class="clearfix"> </div>
				</div>
			</div>
		</div>		
			<!-- banner -->
	<div>个人信息
	<!-- tels -->

		<div class="tels">
			<div class="container">
			<c:if test="${not empty user}">
				<table>
					<tr>
						<td>用户名</td>
						<td>姓名</td>
						<td>手机</td>
						<td>邮箱</td>
					</tr>
					<tr>
						<td>${user.username}</td>
						<td>${user.name }</td>
						<td>${user.phone }</td>
						<td>${uer.email }</td>
					</tr>
				</table>
			</c:if>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp" %>
	

	
  </body>
</html>
