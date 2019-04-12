<%@ page language="java" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="s" uri="/struts-tags"%>--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
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
           function orderDetail(id)
           {
              var url="<%=path %>/orderDetail?id="+id;
              var ret = window.open(url,"","dialogWidth:800px; dialogHeight:300px; dialogLeft: status:no; directories:yes;scrollbars:yes;Resizable=no;");
           }
        
           function orderShouli(id)
           {
               if(confirm('您确定受理订单吗？'))
               {
                   window.location.href="<%=path %>/orderShouli?id="+id;
               }
           }
           
       </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/images/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="8" background="<%=path %>/images/tbg.gif">&nbsp;&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
				    <td width="4%">序号</td>
					<td width="10%">订单编号</td>
					<td width="10%">下单日期</td>
					<td width="10%">状态</td>
					
					<td width="18%">送货地址</td>
					<td width="10%">付款方式</td>
					<td width="10%">订单价格</td>
					<td width="15%">操作</td>
		        </tr>	
				<s:forEach items="${orderList}" var="order" varStatus="status">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
							${status.index + 1}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						${order.bianhao}
					</td>
					<td bgcolor="#FFFFFF" align="center">
							${order.xiadanshi}
					</td>
					<td bgcolor="#FFFFFF" align="center">
							${order.zt}
					</td>
					
					<td bgcolor="#FFFFFF" align="center">
							${order.songhuodizhi}
					</td>
					<td bgcolor="#FFFFFF" align="center">
							${order.fukuanfangshi}
					</td>
					<td bgcolor="#FFFFFF" align="center">
							${order.zongjia}
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:if test="${order.zt == '已受理'}">
							<a href="#" onclick="orderDetail('${order.id}')" class="pn-loperator">订单明细</a>
						</s:if>

						<s:if test="${order.zt == '待受理'}">
							<a href="#" onclick="orderDetail('${order.id}')" class="pn-loperator">订单明细</a>
							<a href="#" onclick="orderShouli('${order.id}')" class="pn-loperator">受理订单</a>
						</s:if>
					</td>
				</tr>
				</s:forEach>
			</table>
	</body>
</html>
