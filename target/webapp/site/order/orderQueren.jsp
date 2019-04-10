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
          function back1()
	        {
	           window.history.go(-1);
	        }
	        
	        function dd()
	        {
	            var fukuanfangshi=document.f.fukuanfangshi.value;
	            //alert(odderFukuangfangshi);
	            if(fukuanfangshi=="银行付款")
	            {
	                 document.getElementById("qufukuan").style.display="block";
	            }
	            if(fukuanfangshi=="货到付款")
	            {
	                 document.getElementById("qufukuan").style.display="none";
	            }
	        }
	        
	        function kahao()
	        {
	            var strUrl = "<%=path %>/site/order/kahao.jsp";
				var ret = window.showModalDialog(strUrl,"","dialogWidth:700px; dialogHeight:500px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
	        }  
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
					          <h2>购物车</h2><div class="clr"></div>
					          <div>
					              <form action="<%=path %>/orderSubmit.action" name="f" method="post">
		                        <table width="99%" border="0" cellpadding="2" cellspacing="1" bgcolor="#FFFFFF" align="center" style="margin-top:8px">
					              <tr align='center' bgcolor="#FFFFFF" height="22">
					                  <td width="20%" align="center">收货人帐号：</td>
					                  <td width="80%" align="left">
					                      <input type="text" readonly="readonly" value="<s:property value="#session.huiyuan.loginname"/>"/>
					                  </td>
					              </tr>
					              <tr align='center' bgcolor="#FFFFFF" height="22">
					                  <td width="20%" align="center">收货人姓名：</td>
					                  <td width="80%" align="left">
					                      <input type="text" readonly="readonly" value="<s:property value="#session.huiyuan.xingming"/>"/>
					                  </td>
					              </tr>
					              <tr align='center' bgcolor="#FFFFFF" height="22">
					                  <td width="20%" align="center">收货人电话：</td>
					                  <td width="80%" align="left">
					                      <input type="text" readonly="readonly" value="<s:property value="#session.huiyuan.dianhua"/>"/>
					                  </td>
					              </tr>
					              <tr align='center' bgcolor="#FFFFFF" height="22">
					                  <td width="20%" align="center">收货人地址：</td>
					                  <td width="80%" align="left">
					                      <input type="text" readonly="readonly" value="<s:property value="#session.huiyuan.address"/>"/>
					                  </td>
					              </tr>
					              <tr align='center' bgcolor="#FFFFFF" height="22">
					                  <td width="20%" align="center">送货地址：</td>
					                  <td width="80%" align="left"><input type="text" name="songhuodizhi"/></td>
					              </tr>
					              <tr align='center' bgcolor="#FFFFFF" height="22">
					                  <td width="20%" align="center">付款方式：</td>
					                  <td width="80%" align="left">
		   		                          <select name="fukuanfangshi" style="width:155px;" onchange="dd()">
		   		                               <option value="货到付款">货到付款</option>
		   		                               <option value="银行付款">银行付款</option>
		   		                          </select>
		   		                          <input type="button" onclick="kahao()" id="qufukuan" style="display: none" value="查看卡号"/>
		                              </td>
					              </tr>
		        				</table>
		        				<table>
		        				   <tr height="7"><td></td></tr>
				                   <tr>
				                       <td><a href="#" onclick="back1()" style="font-family: 微软雅黑;font-size: 15px;">返回修改</a></td>
				                       <td><a href="#" onclick="javascript:document.f.submit();" style="font-family: 微软雅黑;font-size: 15px;">提交订单</a></td>
				                   </tr>
				               </table>
				        </form>
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
