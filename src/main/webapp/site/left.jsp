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
    <script language="JavaScript">
        function check() {
            if(document.formAdd.mingcheng.value=="")
            {
                alert("请输入名称");
                return false;
            }
            return true;
        }
    </script>
  </head>
  
  <body>
       <div class="gadget">
          <h2 class="star">物品类别</h2><div class="clr"></div>
          <ul class="sb_menu">
            <c:forEach items="${leibieList}" var="leibie" varStatus="ss">
            <li><a style="font-family: 微软雅黑;font-size: 14px;" href="<%=path %>/goodsByLeibie.action?leibieId=${leibie.id }">${leibie.mingcheng }</a></li>
            </c:forEach>
          </ul>
       </div>
       <div class="gadget">
          <h2 class="star">信息查询</h2><div class="clr"></div>
          <form action="<%=path %>/site/goodsRes" name="formAdd" method="post">
				     <table width="98%">
						<tr >
						    <td width="100%" bgcolor="#FFFFFF" align="left">
						                        名称：<input type="text" name="mingcheng" size="14"/>                
						        <input type="submit" value="提交" onclick="check()"/>&nbsp; 
						    </td>
						</tr>
					 </table>
			</form>
       </div>
       <div class="gadget">
          <h2 class="star">联系我们</h2><div class="clr"></div>
          <ul class="ex_menu">
            <li><a href="#">地址：北京东环大厦1203</a></li>
            <li><a href="#">电话：010-789564/102</a></li>
          </ul>
       </div>
  </body>
</html>
