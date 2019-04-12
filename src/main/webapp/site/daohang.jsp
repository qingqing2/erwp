<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript" src="<%=path %>/js/popup_shuaxin.js"></script>
	<script type='text/javascript' src='<%=path %>/dwr/interface/loginService.js'></script>
    <script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
    
    <script type="text/javascript">
	   function userlogin()
       {
            var url="<%=path %>/site/userlogin/userlogin.jsp";
            var pop=new Popup({ contentType:1,isReloadOnClose:false,width:500,height:220});
            pop.setContent("contentUrl",url);
            pop.setContent("title","会员登录");
            pop.build();
            pop.show();
       }
       
       function userLogout()
       {
            loginService.userLogout(callback111);
       }
       
       
       function callback111(data)
	   {
		    alert("成功退出系统");
		    var url="<%=path %>/index.action";
		    window.location.href=url;
	   }
        
       function mycart()
       {
            <c:if test="${sessionScope.userType !=1}">
                  alert("请先登录");
            </c:if>
            
            <c:if test="${sessionScope.userType==1}">
                var s="<%=path %>/myCart.action";
	            window.location.href=s;
            </c:if>
       } 
         
       function orderMine()
       {
            <c:if test="${sessionScope.userType !=1}">
                  alert("请先登录");
            </c:if>
            
            <c:if test="${sessionScope.userType==1}">
                var s="<%=path %>/orderMine.action";
	            window.location.href=s;
            </c:if>
       } 
    </script>
	
  </head>
  
  <body>
      <div class="menu_nav" style="height:150px">
	        <ul>
	          <li><a href="<%=path %>/index.action" style="font-family: 微软雅黑">物品展示</a></li>
	          <li><a href="<%=path %>/site/userreg/userreg.jsp" style="font-family: 微软雅黑">会员注册</a></li>
	          <li><a href="#" onclick="mycart()" style="font-family: 微软雅黑">我的购物车</a></li>
	          <li><a href="#" onclick="orderMine()" style="font-family: 微软雅黑">我的订单</a></li>
	          <li><a href="<%=path %>/site/liuyan/liuyanAdd.jsp" style="font-family: 微软雅黑">站内信</a></li>
	          
	          
	          <c:if test="${sessionScope.userType ==1 }">
			     <li><a style="color: white;font-family: 微软雅黑">欢迎您：${sessionScope.huiyuan.xingming }&nbsp;&nbsp;</a></li>
			     <li><a href="#" onclick="userLogout()" style="color: white;font-family: 微软雅黑">安全退出</a> &nbsp;&nbsp;</li>
			  </c:if>
			  <c:if test="${sessionScope.userType !=1 }">
			     <li><a href="#" onclick="userlogin()" style="color: white;font-family: 微软雅黑">会员登陆</a></li>
			  </c:if>
	        </ul>
      </div>
  </body>
</html>
