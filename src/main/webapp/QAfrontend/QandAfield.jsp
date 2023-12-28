<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--usebeanやimportを導入 --%>
<%@include file="/QAincludefile/QApagetop.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<%--ページの表示方法等の導入 --%>
		<%@include file="/QAincludefile/QAhead.jsp" %>
		<title>一問一答/項目別</title>
	</head>
	<body>
		<%--画面上側を表示 --%>
		<%@include file="/QAincludefile/QAh1.jsp" %>
	
		<div class="SplitScreen">
			<div class="left">
				<div class="test">
					<%=choisfi %>を選択中です。
					<%--作成した項目一覧の表示 --%>
					<%@include file="/QAincludefile/QAfieldlist.jsp" %>
					
					<%--問題を一問ランダム表示 --%>
					<%@include file="/QAincludefile/QArandomquestion.jsp" %>
					
					<form action="?" method="post">
						<%--id,passを送信する --%>
						<%@include file="/QAincludefile/QAid,pass,input.jsp" %>
						<input type="hidden" name="field" value="<%=choisfi %>">
						
						<input type="submit" value="ホームへ戻る" formaction="/QAsite/login">					
						<input type="submit" value="次の問題へ" formaction="/QAsite/field">
					</form>
				</div>
			</div>
			
			<%--画面右側を表示 --%>
			<%@include file="/QAincludefile/QArightside.jsp" %>
		
			<%--画面下側を表示 --%>
			<%@include file="/QAincludefile/QAfooter.jsp" %>
		</div>
		
		
	</body>
</html>