<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
      <script type='text/javascript' src='<%=path %>/js/jquery-1.3.2.min.js'></script>
    <script language="javascript">
        function check()
        {
            if(document.formAdd.fujian.value=="")
            {
                alert("请选择文件");
                return false;
            }
            var fujian = $("#fujian2").val();
            var index = fujian.lastIndexOf("\\") + 1;
            var name = fujian.substring(index);
            parent.document.getElementById("fujian1").value = name; 
            return true;
        }
    </script>
  </head>
  
  <body>
       <form action="<%=path %>/uploadF" name="formAdd" method="post"  enctype="multipart/form-data">
           <input type="file" name="fujian" id="fujian2" onKeyDown="javascript:alert('此信息不能手动输入');return false;" />
           <input type="submit" value="提交" onclick="return check()"/>
       </form>
  </body>
</html>
