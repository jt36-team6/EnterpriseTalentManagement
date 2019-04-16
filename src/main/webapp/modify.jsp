<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>修改人才信息</h1>
<form action="/modify/${enterprisetalent.id}">
    <table border="1px">
        <tr>
            <td>人才姓名（*）</td>
            <td><input type="text" name="name" value="${enterprisetalent.name}"></td>
        </tr>
        <tr>
            <td>工作年限</td>
            <td><input type="text" name="workingLife" value="${enterprisetalent.workingLife}"></td>
        </tr>
        <tr>
            <td>所属部门（*）</td>
            <td>
                <select name="departmentId">
                    <c:if test="${departmentList != null }">
                        <option value="0">--请选择--</option>
                        <c:forEach var="department" items="${departmentList}">
                            <option <c:if test="${department.id == enterprisetalent.departmentId }">selected="selected"</c:if>value="${department.id}">${department.name}</option>
                        </c:forEach>
                    </c:if>
                </select>
            </td>
        </tr>
        <tr>
            <td>毕业学校</td>
            <td><input type="text" name="graduateSchool" value="${enterprisetalent.graduateSchool}"></td>
        </tr>
        <tr>
            <td>个人简介</td>
            <td><textarea name="personalProfile"  cols="30" rows="3">${enterprisetalent.personalProfile}</textarea></td>
        </tr>
        <tr>
            <td>工作经历</td>
            <td><textarea name="workExperience"  cols="30" rows="3" >${enterprisetalent.workExperience}</textarea></td>
        </tr>
    </table>
    <input type="submit" value="提交">
    <input type="button" value="返回">
</form>
</body>
</html>
