<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--usebeanやimportを導入 --%>
<%@include file="/QAincludefile/QApagetop.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<%--ページの表示方法等の導入 --%>
		<%@include file="/QAincludefile/QAhead.jsp" %>
		<title>一問一答/編集</title>
	</head>
	<body>
		<%--画面上側を表示 --%>
		<%@include file="/QAincludefile/QAh1.jsp" %>
				
		<%=msg %>
		<div class="SplitScreen">
			<div class="left">
				<table border="1">
					<tr>
						<th width="200">項目</th>
						<th width="550">問題</th>
						<th width="200">解答</th>
					</tr>
					<% for (int i = 0; i < listdto.size(); i++) {
							QAListBean listbean = listdto.get(i);
					%>
						<tr>
							<td align="center"><%=listbean.getField()%></td>
							<td align="center"><%=listbean.getQuestion()%></td>
							<td align="center"><%=listbean.getAnswer()%></td>
						</tr>
					<% } %>
				</table>
				
				<%--一つ前へ戻る --%>
				<form action="/QAsite/login" method="post">
					<%--id,passを送信する --%>
					<%@include file="/QAincludefile/QAid,pass,input.jsp" %>
					<input type="submit" value="ホームへ戻る">
				</form>
			</div>
			
			<%--画面右側を表示 --%>
			<%@include file="/QAincludefile/QArightside.jsp" %>
			
			<%--画面下側を表示 --%>
			<%@include file="/QAincludefile/QAfooter.jsp" %>
		</div>
		
	</body>
</html>