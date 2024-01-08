package servlet;

import java.io.IOException;
import java.util.Set;

import bean.QAAccountBean;
import bean.QAListDTO;
import dao.QAAccountDAO;
import dao.QAFieldDAO;
import dao.QAListDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class QALoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws IOException, ServletException {
		
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		
		//記入したuser、passが登録されているデータに一致しているかの確認。
		QAAccountDAO accdao = new QAAccountDAO();
		QAAccountBean accbe = accdao.select(id);
		String dbpass = accbe.getPass();
		HttpSession session = req.getSession(true);
		if(pass.equalsIgnoreCase(dbpass)) {
			session.setAttribute("ssid", id);
			session.setAttribute("sspass", pass);
		}else {
			session.invalidate();
		}
		
		//項目を纏めて取得
		QAFieldDAO fiedao = new QAFieldDAO();
		Set<String> fielis = fiedao.select(id);

		//ランダムで一問DBから取得。
		QAListDAO listdao = new QAListDAO();
		QAListDTO listdto =listdao.select(id);
		
		//jspに情報を転送
		req.setAttribute("fielis", fielis);
		req.setAttribute("listdto", listdto);
		req.setAttribute("id", id);
		req.setAttribute("pass", pass);
		RequestDispatcher rd = req.getRequestDispatcher("/QAfrontend/QandAhome.jsp");
		rd.forward(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		doPost(req, res);
	}
}
