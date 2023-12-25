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
		<div class="SplitScreen">
			<strong><a href="https://www.youtube.com/@SekaChan">主な参考</a></strong><br/>
			
			<h2>サーブレット</h2>
			<div class="left">
				<img src="./QAimages/QAServlet.png" width="100%">
			</div>
			<div class="right">
				<strong>例外処理</strong><br/>
				例外発生時例外クラのオブジェクトスが自動生成され、処理実行が中断される。<br/>
				try-catchで例外時の処理、throws 例外クラスで例外発生の可能性を宣言する。<br/>
				なお、throw　例外オブジェクトで強制的に発生させることも可能。<br/><br/>
				
				<strong>アノテーション、継承</strong><br/>
				＠でサーブレットのアドレスを指定している。<br/>
				HttpServlet継承でwebブラウザからのリクエストを受け取れるようになる。<br/><br/>
				
				<strong>serialVersionUID</strong><br/>
				<a href="https://daisuke-m.hatenablog.com/entry/20100414/1271228333">参考文献</a><br/>
				クラスのメンバに何か変更があったときは、この数値も変わる。<br/>
				送受信側のこの値が一致したらば、
				正常にシリアライズ・デシリアライズができるという保証をする。<br/>
				例）person(数値);ファイルを送信<br/>
				送信元クラスはperson(int a){int age = a;}<br/>
				受信クラスはperson(java.util.Date b){java.util.Date = b;}<br/>
				とすると、送受信で表示結果が変わる。<br/>
				これを防ぐために値を"～L"とすることで、
				値が一致しない場合はエラーを吐く。
			</div>
			
			<h2>DAO</h2>
			<div class="left">
				<img src="./QAimages/QADAOa.png" width="100%">
				<img src="./QAimages/QADAOb.png" width="100%">
				<img src="./QAimages/QADAOc.png" width="100%">
			</div>
			<div class="right">
				<strong>Class.forName()</strong><br/>
				<a href="https://kanda-it-school-kensyu.com/java-jdbc-contents/jj_ch01/jj_0104/">参考文献</a><br/>
				クラス内でJDBCドライバを利用可能にするため記述される。<br/>
				JDBCドライバとはjarファイルのこと。<br/><br/>
				
				<strong>sqlの戻り値int</strong><br/>
				後進行数が渡されるため、戻り知はint<br/><br/>
				
				<strong>LinkedHashSet</strong><br/>
				SetはListと違い重複した値を持たない。<br/>
				LinkedHashSetは受け取った順番のまま表示する。<br/>
				なお、オブジェクト生成時右辺のダイアモンド演算子（＜＞）
				はデータ型の省略が可能。
			</div>
			
			<h2>DTO</h2>
			<div class="left">
				<img src="./QAimages/QADTO.png" width="100%">
			</div>
			<div class="right">
				<strong>DTOクラスとは</strong><br/>
				<a href="https://kanda-it-school-kensyu.com/java-jdbc-contents/jj_ch04/jj_0402/">参考文献</a><br/>
				DBに接続し要素を受け取る際、DTOを使うことで
				一度に情報を受け取ることで、アクセス回数を減らし
				パフォーマンスを向上させる。<br/><br/>
				
				<strong>シリアライズとは</strong><br/>
				データをバイト列にし読み書き可能にする。
			</div>
			
			<h2>jsp</h2>
			<div class="left">
				画像なし
			</div>
			<div class="right">
				<strong>キャスト</strong><br/>
				セッション、リクエストスコープはどちらも
				Object型の為、変数代入時キャストが必要。
			</div>
			
			<%--画面下側を表示 --%>
			<%@include file="/QAincludefile/QAfooter.jsp" %>
		</div>
	</body>
</html>