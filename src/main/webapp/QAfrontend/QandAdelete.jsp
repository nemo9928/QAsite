<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<%--ページの表示方法等の導入 --%>
		<%@include file="/QAincludefile/QAhead.jsp" %>
		<title>一問一答</title>
	</head>
	<body>
		<%--画面上側を表示 --%>
		<%@include file="/QAincludefile/QAh1.jsp" %>
		<div class="center">
			<h2>アカウントの削除</h2>
			<div class="center-contents">
				<form action="?" method="post">
					ユーザーid<br/>
					<input type="text" name="id"><br/>
					パスワード<br/>
					<input type="password" name="pass"><br/><br/>
					
					※復旧はできません<br/>
					※作成した問題も削除されます<br/><br/>
					
					<div class="RightLeft">
						<a href="http://localhost:8080/QAsite/QAfrontend/QandA.html">戻る</a>
						<input type="submit" name="btn" value="削除" formaction="/QAsite/register">
					</div>
				</form>
			</div>
		</div>
		
		<%--画面下側を表示 --%>
		<%@include file="/QAincludefile/QAfooter.jsp" %>
		</div>
		
	</body>
</html>
