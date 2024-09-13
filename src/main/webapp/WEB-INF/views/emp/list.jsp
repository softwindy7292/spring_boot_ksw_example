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
	<h1>emp 리스트</h1>
	<table border="1">
		<tr>
			<td>사원번호</td>
			<td>사원이름</td>
			<td>직업</td>
			<td>매니저</td>
			<td>입사일자</td>
			<td>급여</td>
			<td>보너스</td>
			<td>부서번호</td>
		</tr>
		<c:forEach var="emp" items="${empList}">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.job}</td>
				<td>${emp.mgr}</td>
				<td>${emp.hiredate}</td>
				<td><fmt:formatNumber value="${emp.sal}" type="number"/></td>
                <!-- 숫자 1000을 1,000으로 표시하는 태그 -->
				<td>${emp.comm}</td>
				<td>${emp.deptno}</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="8"><a href="${pageContext.request.contextPath}/emp/join_view">새로운 직원</a></td>
		</tr>
	</table>
</body>
</html>