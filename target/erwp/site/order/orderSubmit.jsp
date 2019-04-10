<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
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
	
	<script type='text/javascript' src='<%=path %>/dwr/interface/cartService.js'></script>
    <script type='text/javascript' src='<%=path %>/dwr/engine.js'></script>
    <script type='text/javascript' src='<%=path %>/dwr/util.js'></script>
    
    <script language="javascript">

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
					          <h2>&nbsp;</h2><div class="clr"></div>
					          <div>
					              <table width="99%" border="0" cellpadding="5" cellspacing="5" bgcolor="#FFFFFF" align="center" style="margin-top:8px">
				              <tr>
				                  <td align="center" style="color: red">恭喜您，订单提交成功！</td>
				              </tr>
				              <tr>
				                  <td>订单编号：<s:property value="#request.order.bianhao"/></td>
				              </tr>
				              <tr>
				                  <td>下单日期:<s:property value="#request.order.xiadanshi"/></td>
				              </tr>
				              <tr>
				                  <td>送货地址:<s:property value="#request.order.songhuodizhi"/></td>
				              </tr>
				              <tr>
				                  <td>付款方式:<s:property value="#request.order.fukuanfangshi"/></td>
				              </tr>
				              <tr>
				                  <td>总金额：<s:property value="#request.order.zongjia"/></td>
				              </tr>
				              
		        		</table>
							  </div>     
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
