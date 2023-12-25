package servlet;

import java.io.IOException;
import java.util.Set;

import bean.QAListDTO;
import dao.QAFieldDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/field")
public class QAFieldServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws IOException, ServletException {
		
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		String choisfi = req.getParameter("field");
				
		//項目を纏めて取得
		QAFieldDAO fiedao = new QAFieldDAO();
		Set<String> fielis = fiedao.select(id);

		//ランダムで一問DBから取得。
		QAListDTO listdto = fiedao.select(id, choisfi);
		
		//jspに情報を送信
		req.setAttribute("fielis", fielis);
		req.setAttribute("listdto", listdto);
		req.setAttribute("id", id);
		req.setAttribute("pass", pass);
		req.setAttribute("choisfi", choisfi);
		RequestDispatcher rd = req.getRequestDispatcher("/QAfrontend/QandAfield.jsp");
		rd.forward(req, res);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException{
		doPost(req, res);
	}
}
