<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<% QAListBean listbean = listdto.get(0);%>
<h2><%=listbean.getField()%></h2>
<strong>問題</strong>
<div class="question"><%=listbean.getQuestion()%></div>
	
<input type="checkbox" id="view">
<label class="view" for="view">〇解答を表示</label>
<div class="answer"><%=listbean.getAnswer()%></div><br/>