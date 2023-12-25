<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="right">
	<div class="test">
		<%String sspass = (String) session.getAttribute("sspass");
			if(sspass != null){
		%>
			<br/>編集画面<br/>
			<form action="/QAsite/edit" method="post">
				<h2><input type="text" class="text" name="field"></h2>
				
				<strong>問題</strong><br/>
				<textarea class="textarea" name="question"></textarea><br/>
				
				<strong>解答</strong><br/>
				<textarea class="textarea" name="answer"></textarea></br></br>
				
				<input type="submit" name="btn" value="追加">
				<input type="submit" name="btn" value="全問表示">
				<input type="submit" name="btn" value="削除">
			</form>
		<%}else{ %>
			ユーザーidかpasswordが間違っています
		<% } %>
	</div>
</div>