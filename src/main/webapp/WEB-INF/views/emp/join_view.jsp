<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새로운 직원 입력</title>
</head>
<body>
	<h1>새로운 직원 입력</h1>
	<table>
		<form action="${pageContext.request.contextPath}/emp/join" method="post">
			<tr>
				<td>사원번호</td>
				<td><input type="text" name="empno"></td>
			</tr>
			<tr>
				<td>사원이름</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>사원직급</td>
				<td><input type="text" name="job"></td>
			</tr>
			<tr>
				<td>매니저</td>
				<td>
					<select name="mgr">
						<option value="0">없음</option>
						<c:forEach var="emp" items="${empList}">
							<option value="${emp.empno}">(${emp.empno})${emp.ename}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>급여</td>
				<td><input type="text" name="sal"></td>
			</tr>
			<tr>
				<td>보너스</td>
				<td><input type="text" name="comm"></td>
			</tr>
			<tr>
				<td>부서번호</td>
				<td>
					<select name="deptno">
						<c:forEach var="dept" items="${deptList}">
							<option value="${dept.deptno}">(${dept.deptno})${dept.dname}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="제출"></td>
			</tr>
		</form>
	</table>
</body>
</html>