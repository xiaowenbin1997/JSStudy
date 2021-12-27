<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/12/27
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <script type="text/javascript">
    var stuObj = ${requestScope.key1};
    // window.alert("类型:" + typeof stuObj)
    window.alert("学员编号 ：" + stuObj.sid + "学员姓名 ：" + stuObj.sname)
  </script>
</head>
<body>

</body>
</html>
