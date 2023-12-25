package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedHashSet;
import java.util.Set;

import bean.QAListBean;
import bean.QAListDTO;

public class QAFieldDAO extends QAConnectDBDAO{
	
	//ユーザーが作成した項目全てを取得し纏めるメソッド
	public Set<String> select(String id) {
		String sql = "SELECT field FROM list WHERE id = '" + id + "'";
		Statement stmt = null;
		ResultSet rs = null;
		Set<String> fielis = new LinkedHashSet<String>();
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				fielis.add(rs.getString("field"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		disconnect();
		return fielis;
	}
	
	//選択したfieldの問題をランダム一問表示するメソッド
	public QAListDTO select(String id, String choisfi) {
		QAListDTO listdto = new QAListDTO();
		String sql = "SELECT * FROM list WHERE id = '" + id + "' AND field = '" + choisfi + 
				"' ORDER BY RAND() LIMIT 1";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				QAListBean listbean = new QAListBean();
				listbean.setId(rs.getString("id"));
				listbean.setField(rs.getString("field"));
				listbean.setQuestion(rs.getString("question"));
				listbean.setAnswer(rs.getString("answer"));
				listdto.add(listbean);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(stmt != null)stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		disconnect();
		return listdto;
	}
}
