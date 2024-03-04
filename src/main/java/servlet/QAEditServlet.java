package servlet;

import java.io.IOException;

import bean.QAListDTO;
import dao.QAEditDAO;
import dao.QAListDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/edit")
public class QAEditServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws IOException, ServletException {
		
		req.setCharacterEncoding("utf-8");
		String btn = req.getParameter("btn");
		String msg = "";
		HttpSession session = req.getSession(true);
		String ssid = (String) session.getAttribute("ssid");
		String sspass = (String) session.getAttribute("sspass");
		
		//更新処理文を送信
		QAEditDAO edao = new QAEditDAO();
		if(btn.equals("追加")) {
			String field = req.getParameter("field");
			String question = req.getParameter("question");
			String answer = req.getParameter("answer");
			if(field != "" && question != "" && answer != "") {
				edao.insert(ssid, field, question, answer);
				msg = question + "を追加しました";
			}else {
				msg = "未記入のものがあります";
			}
		}else if(btn.equals("削除")){
			String question = req.getParameter("question");
			String field = req.getParameter("field");
			edao.delete(ssid, field, question);
			msg= question + "を削除しました";
		}
		
		//すべての問題を取得する
		QAListDAO listdao = new QAListDAO();
		QAListDTO listdto = listdao.select(ssid, sspass);
		
		//jspに情報を転送
		req.setAttribute("listdto", listdto);
		req.setAttribute("id", ssid);
		req.setAttribute("pass", sspass);
		req.setAttribute("msg", msg);
		RequestDispatcher rd = req.getRequestDispatcher("/QAfrontend/QandAedit.jsp");
		rd.forward(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		doPost(req, res);
	}
}