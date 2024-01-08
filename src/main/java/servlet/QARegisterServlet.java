package servlet;

import java.io.IOException;

import bean.QAAccountBean;
import dao.QAAccountDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class QARegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws IOException, ServletException {
		
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		String btn = req.getParameter("btn");
		String msg = "";
		
		//DB接続用のオブジェクトを作成
		QAAccountDAO accdao = new QAAccountDAO();
		
		//記入したuserがすでに登録されているかを確認
		QAAccountBean accbe = accdao.select(id);
		String dbid = accbe.getId();
		String dbpass = accbe.getPass();
		
		/*新規userかつパスワードが設定されている際には登録
		  id pass が一致した際には削除*/
		if(btn.equals("新規登録")) {
			if(id.equalsIgnoreCase(dbid)) {
				msg = "すでに登録されています。";
			}else if(id.equals("") || pass.equals("")){
				msg = "id or pass が未設定です";
			}else { 
				accdao.insert(id, pass);
				msg = "登録しました！";
			}
		}else if(btn.equals("削除")) {
			if(id.equalsIgnoreCase(dbid) && pass.equalsIgnoreCase(dbpass)) {
				accdao.delete(id);
				msg = "アカウントを削除しました。";
			}else {
				msg = "id or pass が違います。";
			}
		}
		
		//JSPに情報を転送
		req.setAttribute("msg", msg);
		RequestDispatcher rd = req.getRequestDispatcher("/QAfrontend/QandA.jsp");
		rd.forward(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		doPost(req, res);
	}
}
