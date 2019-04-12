<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	
	<link href="<%=path %>/css/qiantai.css" rel="stylesheet" type="text/css" />
	
	<script type="text/javascript">
           <%--var url="<%=path %>/goodsAll";--%>
           <%--window.location.href=url;--%>
       </script>
  </head>
  
<body>
<div class="main">
	  <div class="header">
		    <div class="header_resize">
			      <div class="logo"><br/><h1 style="font-size: 26px;">校园二手物品交易网站<small>&nbsp;</small></h1></div>
				      <jsp:include flush="true" page="/site/daohang.jsp"></jsp:include>
			      <div class="clr"></div>
		    </div>
	  </div>
	  <div class="content">
		    <div class="content_resize">
			      <div class="mainbar">
				        <!--  -->
				        <div class="article">
					          <h2>111</h2><div class="clr"></div>
					          <p><span class="date">111111111</span></p>
					          <img src="<%=path %>/images/img1.jpg" width="263" height="146" alt="image" class="fl" />
					          <p>
							             11
					          </p>
					          <p class="spec"></p>
				        </div>
				        <!--  -->
			      </div>
			      <div class="sidebar">
				        <jsp:include flush="true" page="/site/left.jsp"></jsp:include>
			      </div>
			      <div class="clr"></div>
		    </div>
	  </div>

	  <div class="fbg">
	    <div class="fbg_resize" align="center">
	         <a href="<%=path %>/login.jsp">系统管理员登陆</a>
	    </div>
	  </div>
</div>


</body>
</html>
