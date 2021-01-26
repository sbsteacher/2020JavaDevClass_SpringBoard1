<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<link rel="stylesheet" href="/res/css/common.css">
<script defer src="/res/js/common.js"></script>
</head>
<body>
	<h1>리스트</h1>
	<div>
		<a href="/write">글등록</a>
	</div>
	<table>
		<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성일시</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="item">
			<tr onclick="moveToDetail(${item.i_board});">
				<td>${item.i_board}</td>
				<td>${item.title}</td>
				<td>${item.r_dt}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>