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
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		
		<script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
		
        <script language="javascript">
        </script>
        
        <style type="text/css">
        .c1-bline{border-bottom:#999 1px dashed;border-top:1px;}
			.f-right{float:right}
			.f-left{float:left}
			.clear{clear:both}
        </style>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
		<div class="Slot">
				<c:forEach items="${requestScope.pingjiaList}" var="pingjia">
				   <div class="c1-bline" style="padding:7px 0px;">
				       <div class="f-left">
					     <img src="<%=path %>/img/head-mark4.gif" align="middle" class="img-vm" border="0"/> 
				           ${pingjia.neirong}
				       </div>
				      <div class="f-right">${pingjia.shijian}</div>
				      <div class="clear"></div>
			       </div>
	            </c:forEach>
	    </div>
	</body>
</html>
