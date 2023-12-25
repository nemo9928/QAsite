package dao;

import java.sql.ResultSet;
import java.sql.Statement;

import bean.QAAccountBean;

public class QAAccountDAO extends QAConnectDBDAO{
		
	//ユーザーidの情報を取得します。
	public QAAccountBean select(String id) {
		QAAccountBean qaab = new QAAccountBean();
		String sql = "SELECT * FROM account WHERE id = '" + id + "'";
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				qaab.setId(rs.getString("id"));
				qaab.setPass(rs.getString("pass"));
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
		return qaab;
	}
	
	//insert deleteメソッドが実行された際sql文を実行
	public int insert(String id, String pass) {
		String sql = "INSERT INTO account VALUES('" + id + "', '" + pass + "')";
		return executeSql(sql);
	}
	public int delete(String id) {
		String sql = "DELETE FROm account WHERE id = '" + id + "'";
		return executeSql(sql);
	}
	
	public int executeSql(String sql) {
		Statement stmt = null;
		int result  = 0;
		
		try {
			connect();
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null)stmt.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		disconnect();
		return result;
	}
}
