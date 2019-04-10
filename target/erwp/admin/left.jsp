<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN""http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	
	<link rel="stylesheet" href="<%=path %>/css/reset.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="<%=path %>/css/style.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="<%=path %>/css/invalid.css" type="text/css" media="screen" />
	
	<script type="text/javascript" src="<%=path %>/js/jquery-1.3.2.min.js"></script>
	<script type="text/javascript" src="<%=path %>/js/simpla.jquery.configuration.js"></script>
	
	<script type="text/javascript">
	    function logout()
		{
		   if(confirm("确定要退出本系统吗??"))
		   {
			   window.parent.location="<%=path %>/login.jsp";
		   }
		}
	</script>
	
  </head>
  
<body>
    <div id="sidebar">
	    <div id="sidebar-wrapper">
		      <div id="profile-links">
		           <br /><br /><br />
		           <a href="#" style="font-family: 微软雅黑;font-size: 15px;">你好：管理员</a>&nbsp;&nbsp;&nbsp;
		           <a href="#" style="font-family: 微软雅黑;font-size: 15px;" onclick="logout()">注销退出</a> 
		      </div>
		      <ul id="main-nav">
		           <li><a href="#" class="nav-top-item" style="font-family: 微软雅黑;font-size: 15px;">修改登陆密码</a>
			           <ul>
			            <li><a href="<%=path %>/admin/userinfo/userPw.jsp" target="rightFrame" style="font-family: 微软雅黑;font-size: 13px;">修改登陆密码</a></li>
			           </ul>
		           </li>
			       <li><a href="#" class="nav-top-item" style="font-family: 微软雅黑;font-size: 15px;">物品类别管理</a>
			          <ul>
			            <li><a href="<%=path %>/leibieMana.action"  target="rightFrame"style="font-family: 微软雅黑;font-size: 13px;">物品类别管理</a></li>
			            <li><a href="<%=path %>/admin/leibie/leibieAdd.jsp" target="rightFrame" style="font-family: 微软雅黑;font-size: 13px;">添加物品类别</a></li>
			          </ul>
			       </li>
			       <li><a href="#" class="nav-top-item" style="font-family: 微软雅黑;font-size: 15px;">物品信息管理</a>
			          <ul>
			            <li><a href="<%=path %>/goodsMana.action"  target="rightFrame"style="font-family: 微软雅黑;font-size: 13px;">物品信息管理</a></li>
			            <li><a href="<%=path %>/admin/goods/goodsAdd.jsp" target="rightFrame" style="font-family: 微软雅黑;font-size: 13px;">添加物品信息</a></li>
			          </ul>
			       </li>
			       <li><a href="#" class="nav-top-item" style="font-family: 微软雅黑;font-size: 15px;">会员信息管理</a>
			          <ul>
			            <li><a href="<%=path %>/huiyuanMana.action"  target="rightFrame"style="font-family: 微软雅黑;font-size: 13px;">会员信息管理</a></li>
			          </ul>
			       </li>
			       <li><a href="#" class="nav-top-item" style="font-family: 微软雅黑;font-size: 15px;">订单信息管理</a>
			          <ul>
			            <li><a href="<%=path %>/orderMana.action"  target="rightFrame"style="font-family: 微软雅黑;font-size: 13px;">订单信息管理</a></li>
			          </ul>
			       </li>
			       <li><a href="#" class="nav-top-item" style="font-family: 微软雅黑;font-size: 15px;">站内信管理</a>
			          <ul>
			            <li><a href="<%=path %>/liuyanMana.action"  target="rightFrame"style="font-family: 微软雅黑;font-size: 13px;">站内信管理</a></li>
			          </ul>
			       </li>
	          </ul>    
	    </div>
	    <!-- <div id="main-content">
	    </div> -->
    </div>
</body>
</html>
