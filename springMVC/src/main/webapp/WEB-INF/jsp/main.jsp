<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>姓名</th>
			<th>性别</th>
			<th>更新</th>
			<th>删除</th>
		</tr>
		<c:forEach items="${users }" var="user">
			<tr>
				<td>${user.name }</td>
				<td>${user.ssex }</td>
				<td><input type="button" value="更新"
					onclick="update(${user.name})"></td>
				<td><input type="button" value="删除"
					onclick="delete(${user.name})"></td>
			</tr>
		</c:forEach>
	</table>
	<input type="button" value="添加" onclick="add()">
</body>
</html>