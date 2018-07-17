<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户名或密码错误</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-2.1.3.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <script>
		$(function(){
		    var wait=10;  
		    timeOut();  
		    function timeOut(){
		      
		        if(wait==0){  
		           window.location.href="login.jsp";
		        }else{                    
		            setTimeout(function(){  
		                wait--;  
		                $('#seconds').text(wait);  
		                timeOut();  
		            },1000);  
		        }  
		    }  
		});
  </script>
  <body>   
	 <c:set var="error" value="" scope="page"/>
	 <c:if test="${not empty requestScope.msg}">
	 	<c:choose>
	 		<c:when test="${requestScope.msg=='2'}">
	 			<c:set var="error" value="密码不正确"/>  			
	 		</c:when>
	 		<c:when test="${requestScope.msg=='1'}">
	 			<c:set var="error" value="用户名不存在"/>  			
	 		</c:when>
	 		<c:otherwise>
	 			<c:set var="error" value="未连接数据库或系统异常"/>  			
	 		</c:otherwise>
	 	</c:choose>
	 </c:if>
	<c:if test="${empty requestScope.msg}">
		<c:set var="error" value="未知原因错误，请重新检查一下用户名或密码!"/>  		
	</c:if>

     <h2>${error}</h2> <br>
    <h3>本页面将在<span id="seconds" style="color:red;">10</span>秒后跳转到登录页面</h3>
    <a href="login.jsp">直接跳转</a>
  </body>
</html>
