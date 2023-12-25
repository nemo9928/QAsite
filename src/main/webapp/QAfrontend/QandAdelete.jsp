<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width">
		<link rel="stylesheet" href="./pagelayout.css">
		<title>一問一答</title>
	</head>
	<body>
		<h1><a href="http://localhost:8080/QAsite/QAfrontend/QandA.html">一問一答</a></h1>
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