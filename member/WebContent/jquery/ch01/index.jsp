<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="context" value="<%=request.getContextPath() %>"></c:set>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Chapter 01. jQuery 기본</title>
</head>
<body>
	<h1> Chapter 01. jQuery 기본 </h1>
	<ol>
		<li> <a href="${context }/jquery/example01_01.do"> 페이지가 렌더링된 후 CSS 변경하기 </a> </li>
	</ol>
</body>
</html>
