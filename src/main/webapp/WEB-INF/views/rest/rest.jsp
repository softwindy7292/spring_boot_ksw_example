<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 리스트</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/board.js"></script>

<script type="text/javascript">

	$(document).ready(function(){
		
		let board = boardService();
		//board.list();
		//board.get(2001);
		
		let myboard = {
			bid : 2092,
			bname : "바꾸기!",
			bcontent : "확인바랍니다",
			btitle : "뇸뇸"
		}
		
		//board.add(myboard);
		
		//board.del(2093);
		
		board.update(myboard);
		
	});
	
</script>
</head>
<body>
	<h1>restful 게시판 연습</h1>
</body>
</html>