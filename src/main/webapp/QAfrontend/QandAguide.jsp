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

		<div class="SplitScreen">
			<div class="left">
				<img src="./QAimages/QAregister.png" width="100%">
			</div>
			<div class="right">
				<strong>新規登録・ログイン画面</strong><br/>
				
				入力フォームに情報を入力後
				新規登録、ログインボタンをおすことで
				処理が実行されます。<br/><br/>
				
				新規登録の際入力に誤り、
				もしくはすでにuserが存在している際は、
				メッセージが表示されます。<br/><br/>
				
				ログイン時パスワードを記入しない、
				もしくはパスワードが間違っていた際は、
				編集画面は表示されません。
			</div><br/><br/>
			
			<div class="left">
				<img src="./QAimages/QAhome.png" width="100%">
			</div>
			<div class="right">
				<strong>ホーム画面等</strong><br/>
				
				・左側<br/>
				画面左側は作成された問題を
				ランダムで表示します。<br/><br/>
				
				上部[問題を絞る]を選択した際、
				開発者が分類した問題のみ表示可能になります<br/><br/>
				
				解答を表示を押すことで
				解答を確認できます。<br/><br/>
				
				次の問題へを押すことで
				ランダムで一問表示されます。<br/><br/><br/>
				
				
				・右側<br/>
				画面右側は開発者がログイン時、
				問題の作成、削除、一覧表示が可能となります。<br/><br/>
				
				問題削除の際には解答以外の２つを
				記入してください。<br/>
				重複した問題がある際には
				どちらも削除されます。
			</div>
			
			<%--画面下側を表示 --%>
			<%@include file="/QAincludefile/QAfooter.jsp" %>
			</div>
		</div>
	</body>
</html>
