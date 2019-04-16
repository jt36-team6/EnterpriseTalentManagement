
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<select name="departmentId">
    <c:if test="${departmentList != null }">
        <option value="0">--请选择--</option>
        <c:forEach var="department" items="${departmentList}">
            <option <c:if test="${department.id == departmentId }">selected="selected"</c:if>value="${department.id}">${department.name}</option>
        </c:forEach>
    </c:if>
</select>
</body>
</html>
