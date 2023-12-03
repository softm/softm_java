<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
<c:forEach items="${results}" var="result">
<tr>
<td>${result.no}</td>
<td>${result.title}</td>
<td>${result.content}</td>
</tr>
</c:forEach>
</table>
</body>
</html>