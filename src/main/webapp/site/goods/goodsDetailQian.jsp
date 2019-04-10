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
	
	<script type="text/javascript">
        function buy1()
        {
            <s:if test="#session.userType !=1">
                  alert("请先登录");
            </s:if>
            <s:if test="#session.userType ==1">
                  document.buy.submit();
            </s:if>
        }
        
        function pingjiaAll(goodsId)
        {
            var strUrl = "<%=path %>/pingjiaAll.action?goodsId="+goodsId;
            var ret = window.showModalDialog(strUrl,"","dialogWidth:800px; dialogHeight:300px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
        }
        function pingjiaAdd(goodsId)
        {
            var strUrl="<%=path %>/site/pingjia/pingjiaAdd.jsp?goodsId="+goodsId;
            var ret = window.showModalDialog(strUrl,"","dialogWidth:800px; dialogHeight:300px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
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
					          <!-- <h2>物品详细信息</h2><div class="clr"></div> -->
					          <div>
							        <form action="<%=path %>/addToCart.action" method="post" name="buy">
				                         <table width="100%" border="0" cellpadding="6" cellspacing="6">
											    <tr>
											       <td align="left"><img width="220" height="180" src="<%=path %>/${requestScope.goods.fujian }" style="border:1px solid #ccc; padding:3px;"/></td>
											    </tr>
											    <tr>
											       <td align="left">名称：${requestScope.goods.mingcheng }</td>
											    </tr>
											    <tr>
											       <td align="left">介绍：<c:out value="${requestScope.goods.jieshao }" escapeXml="false"></c:out></td>
											    </tr>
											    <tr>
											       <td align="left">价格：${requestScope.goods.tejia }</td>
											    </tr>
											    <tr>
											       <td align="left">
											                                  数量：<input type="text" name="shuliang" value="1" size="8" onkeyup="this.value=this.value.replace(/\D/g,'')" onafterpaste="this.value=this.value.replace(/\D/g,'')"/>
											           <input type="hidden" name="goodsId" value="${requestScope.goods.id }"/>
											           <input type="button" value="购买" style="width: 80px;height: 30px;" onclick="buy1()"/>
											           <input type="button" value="查看评价" style="width: 80px;height: 30px;" onclick="pingjiaAll(${requestScope.goods.id })"/>
											           <input type="button" value="我要评价" style="width: 80px;height: 30px;" onclick="pingjiaAdd(${requestScope.goods.id })"/>
											       
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
