
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
<h1>添加人才信息</h1>
<form action="/add">
    <table border="1px">
        <tr>
            <td>人才姓名（*）</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>工作年限</td>
            <td><input type="text" name="workingLife"></td>
        </tr>
        <tr>
            <td>所属部门（*）</td>
            <td>
                <select name="departmentId" >
                    <option value="0">全部</option>
                    <option value="1">工程部</option>
                    <option value="2">信息部</option>
                    <option value="3">人资部</option>
                    <option value="4">制造部</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>毕业学校</td>
            <td><input type="text" name="graduateSchool"></td>
        </tr>
        <tr>
            <td>个人简介</td>
            <td><textarea name="personalProfile"  cols="30" rows="3"></textarea></td>
        </tr>
        <tr>
            <td>工作经历</td>
            <td><textarea name="workExperience"  cols="30" rows="3"></textarea></td>
        </tr>
    </table>
    <input type="submit" value="提交">
    <input type="button" value="返回">
</form>
</body>
</html>
