<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form action="/QAsite/field" method="post">
	<select name="field">
		<% Set<String> fielis = (Set<String>)request.getAttribute("fielis");
			for(String field: fielis) { %>
			<option value="<%=field %>"><%=field %></option>
		<% } %>
	</select>
	<%@include file="/QAincludefile/QAid,pass,input.jsp" %>
	<input type="submit" value="問題を絞る">
</form>