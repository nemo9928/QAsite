<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="bean.*" %>
<jsp:useBean id="listdto" scope="request" class="bean.QAListDTO" />
<jsp:useBean id="id" scope="request" class="java.lang.String" />
<jsp:useBean id="pass" scope="request" class="java.lang.String" />
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
	<head>
		<%--ページの表示方法等の導入 --%>
		<%@include file="/QAincludefile/QAhead.jsp" %>
		<title>一問一答/home</title>
	</head>
	<body>
		<%--画面上側を表示 --%>
		<%@include file="/QAincludefile/QAh1.jsp" %>
	
		<div class="SplitScreen">
			<div class="left">
				<div class="test">
					<%if(listdto.size() != 0){ %>
						<br/>
						<%--作成した項目一覧の表示 --%>
						<%@include file="/QAincludefile/QAfieldlist.jsp" %>
						
						<%--問題を一問ランダム表示 --%>
						<%@include file="/QAincludefile/QArandomquestion.jsp" %>
							
						<form action="/QAsite/login" method="post">
							<%--id,passを送信する --%>
							<%@include file="/QAincludefile/QAid,pass,input.jsp" %>
							<input type="submit" value="次の問題へ">
						</form>
						
					<% }else{ %>
						問題を作成してください
					<% } %>
				</div>
			</div>
			
			<%--画面右側を表示 --%>
			<%@include file="/QAincludefile/QArightside.jsp" %>
			
			<%--画面下側を表示 --%>
			<%@include file="/QAincludefile/QAfooter.jsp" %>
		</div>
		
	</body>
</html>