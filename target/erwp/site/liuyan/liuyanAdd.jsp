<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
        function check()
              {
                  if( document.form1.xingming.value=="")
	               {
	                   alert("请输入您的姓名");
	                   return false;
		           }
	               if( document.form1.neirong.value=="")
	               {
	                   alert("请输入信息内容");
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
					          <h2></h2><div class="clr"></div>
					          <div>
							       <form action="<%=path %>/liuyanAdd.action" name="form1" method="post">
							       <table width="100%" align="center" border="0" cellpadding="4" cellspacing="4">
										<tr align='center'  height="22">
										    <td width="25%" align="right">
										        您的姓名：
										    </td>
										    <td width="75%" align="left">
										         <input type="text" name="xingming" size="20"/>
										    </td>
										</tr>
										<tr align='center'  height="22">
										    <td width="25%" align="right">
										       您的住址：
										    </td>
										    <td width="75%" align="left">
										         <input type="text" name="zuzhi" size="20"/>
										    </td>
										</tr>
										<tr align='center'  height="22">
										    <td width="25%" align="right">
										        联系方式：
										    </td>
										    <td width="75%" align="left">
										         <input type="text" name="dianhua" size="20"/>
										    </td>
										</tr>
										<tr align='center'  height="22">
										    <td width="25%" align="right">
										        电子邮箱：
										    </td>
										    <td width="75%" align="left">
										         <input type="text" name="youxiang" size="20"/>
										    </td>
										</tr>
										<tr align='center'  height="22">
										    <td width="25%" align="right">
										        信息内容：
										    </td>
										    <td width="75%" align="left">
										         <textarea rows="3" cols="40" name="neirong"></textarea>
										    </td>
										</tr>
										<tr align='center'  height="22">
										    <td width="25%" align="right">
										        提交时间：
										    </td>
										    <td width="75%" align="left">
										         <input type="text" name="shijian" size="20" value="<%=new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date())%>"/>
										    </td>
										</tr>
										<tr align='center'  height="22">
										    <td width="25%" align="right">
										        &nbsp;
										    </td>
										    <td width="75%" align="left">
										       <input type="button" value="提交" onclick="check()" style="width: 70px;"/>&nbsp; 
										       <input type="reset" value="重置" style="width: 70px;"/>&nbsp;
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
