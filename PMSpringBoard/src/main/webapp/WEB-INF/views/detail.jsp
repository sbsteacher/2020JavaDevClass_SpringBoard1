<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${data.title}</title>
<link rel="stylesheet" href="/res/css/common.css">
<script defer src="/res/js/common.js"></script>
</head>
<body>
	<div>
		<a href="/list">리스트로 돌아가기</a>
	</div>
	<div>
		<button data-id="${data.i_board}" id="delBtn">삭제</button>
		<button data-id="${data.i_board}" id="modBtn">수정</button>
	</div>
	<div>		
		<div>번호 : ${data.i_board}</div>
		<div>제목 : ${data.title}</div>		
		<div>작성일시 : ${data.r_dt}</div>
		<div>내용 : ${data.ctnt}</div>
	</div>	
</body>
</html>





