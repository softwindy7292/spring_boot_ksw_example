<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>월급 등급</h1>
	<table border="1">
		<tr>
			<td>사원이름</td>
			<td>월급</td>
			<td>부서번호</td>
			<td>부서위치</td>
			<td>등급</td>
		</tr>
		<c:forEach var="grade" items="${gradeList}">
			<tr>
				<td>${grade.ename}</td>
				<td><fmt:formatNumber value="${grade.sal}" type="number"/></td>
				<!-- 숫자 1000을 1,000으로 표시하는 태그 -->
				<td>${grade.dept.deptno}</td>
				<td>${grade.dept.loc}</td>
				<td>${grade.salgrade.grade}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10"><a href="${pageContext.request.contextPath}/emp/join_view">새로운 직원</a></td>
		</tr>
	</table>
</body>
</html>