<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	  <link rel='shortcut icon' href='/erwp/images/title.png' type="image/x-icon"/>
	  <title>校园二手物品交易网站</title>
  </head>
  
	  <frameset rows="*" cols="235,*" framespacing="0" frameborder="no" border="0">
		    <frame src="<%=path %>/admin/left.jsp" name="leftFrame" scrolling="no" noresize="noresize" id="leftFrame" />
			<frame src="<%=path %>/admin/right.jsp"  name="rightFrame"/>
	  </frameset>
</html>
