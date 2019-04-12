<%@ page language="java" pageEncoding="UTF-8"%>
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
	
	<script type="text/javascript">
        function check1()
	    {
	        if(document.form1.loginname.value=="")
	        {
	            alert("请输入账号");
	            return false;
	        }
	        if(document.form1.loginpw.value=="")
	        {
	            alert("请输入密码");
	            return false;
	        }
	        document.form1.submit();
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
					          <h2>会员注册</h2><div class="clr"></div>
					          <div>
							       <form action="<%=path %>/huiyuanReg.action" name="form1" method="post">
												<table width="98%" border="0" align="center" cellpadding="0" cellspacing="1">
													<tr>
														<td width="15%" height="30" align="center" bgcolor="#F9F9F9" style="font-size: 11px;">
															账号：
														</td>
														<td width="80%" bgcolor="#FFFFFF">
															&nbsp;
															<input type="text" name="loginname" style="width: 200px;"/>
														</td>
													</tr>
													<tr>
														<td height="30" align="center" bgcolor="#F9F9F9" style="font-size: 11px;">
															密码：
														</td>
														<td bgcolor="#FFFFFF">
															&nbsp;
															<input type="password" name="loginpw" style="width: 200px;"/>
														</td>
													</tr>
													<tr>
														<td height="30" align="center" bgcolor="#F9F9F9" style="font-size: 11px;">
															姓名：
														</td>
														<td bgcolor="#FFFFFF">
															&nbsp;
															<input type="text" name="xingming" style="width: 200px;"/>
														</td>
													</tr>
													<tr>
														<td height="30" align="center" bgcolor="#F9F9F9" style="font-size: 11px;">
															性别：
														</td>
														<td bgcolor="#FFFFFF">
															&nbsp;
															<input type="radio" name="xingbie" value="男" style="border: 0px;" checked="checked"/>男
															&nbsp;&nbsp;&nbsp;&nbsp;
															<input type="radio" name="xingbie" value="女" style="border: 0px;" checked="checked"/>女
														</td>
													</tr>
													<tr>
														<td height="30" align="center" bgcolor="#F9F9F9" style="font-size: 11px;">
															年龄：
														</td>
														<td bgcolor="#FFFFFF">
															&nbsp;
															<input type="text" name="nianling" style="width: 200px;" onkeyup="value=value.replace(/[^\d]/g,'') " onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))"/>
														</td>
													</tr>
													<tr>
														<td height="30" align="center" bgcolor="#F9F9F9" style="font-size: 11px;">
															住址：
														</td>
														<td bgcolor="#FFFFFF">
															&nbsp;
															<input type="text" name="address" style="width: 200px;"/>
														</td>
													</tr>
													<tr>
														<td height="30" align="center" bgcolor="#F9F9F9" style="font-size: 11px;">
															联系方式：
														</td>
														<td bgcolor="#FFFFFF">
															&nbsp;
															<input type="text" name="dianhua" style="width: 200px;"/>
														</td>
													</tr>
													<tr>
														<td height="30" align="center" bgcolor="#F9F9F9">
															&nbsp;
														</td>
														<td bgcolor="#FFFFFF">
															&nbsp;
															<input type="button" value="确定" onclick="check1();"/>
															<input type="reset" value="重置"/>
														</td>
													</tr>
												</table>
										  </form>
					          </div>
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
