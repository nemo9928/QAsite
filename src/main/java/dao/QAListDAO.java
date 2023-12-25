package dao;

import java.sql.ResultSet;
import java.sql.Statement;

import bean.QAListBean;
import bean.QAListDTO;

public class QAListDAO extends QAConnectDBDAO{
	
	//ユーザーが作成した問題からランダム一問を取得するメソッド
	public QAListDTO select(String id) {
		QAListDTO listdto = new QAListDTO();
		String sql = "SELECT * FROM list WHERE id = '" + id + "' ORDER BY RAND() LIMIT 1";
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
	
	//ユーザーが作成したすべての問題を取得するメソッド
	public QAListDTO select(String ssid, String sspass) {
		QAListDTO listdto = new QAListDTO();
		 String sql = "SELECT * FROM list WHERE id = '" + ssid + "' ORDER BY field ASC";
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

