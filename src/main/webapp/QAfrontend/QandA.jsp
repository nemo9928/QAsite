<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="bean.*" %>
<jsp:useBean id="msg" scope="request" class="java.lang.String" />
    
<!DOCTYPE html>
<html>
	<head
		<%--ページの表示方法等の導入 --%>
		<%@include file="/QAincludefile/QAhead.jsp" %>
		<title>一問一答</title>
	</head>
	<body>
		<%--画面上側を表示 --%>
		<%@include file="/QAincludefile/QAh1.jsp" %>
		
		<div class="center">
			<h2>新規登録・ログイン</h2>
			<div class="center-contents">
				<form action="?" method="post">
					ユーザーid<br/>
					<input type="text" name="id"><br/>
					パスワード<br/>
					<input type="password" name="pass"><br/><br/>
					
					<%=msg %>
					<div class="RightLeft">
						<input type="submit" name="btn" value="新規登録" formaction="/QAsite/register">
						
						<input type="submit" value="ログイン" formaction="/QAsite/login">
					</div>
				</form>
			</div><br/>
			<a href="http://localhost:8080/QAsite/QAfrontend/QandAdelete.jsp">アカウントの削除</a>
		</div>
		
		<%--画面下側を表示 --%>
		<%@include file="/QAincludefile/QAfooter.jsp" %>
		
	</body>
</html>
<%--メモ：libフォルダにconnecterを入れないとDBに接続できない --%>
<%-- user:tes pass:dever --%>

<%--passの表示方法変えるべき？ --%>

<%--eclipse乗でdbの編集（insert）が繁栄されない --%>
