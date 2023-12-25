package dao;

import java.sql.Statement;

public class QAEditDAO extends QAConnectDBDAO{

	//DBを編集するsql
	public int insert(String ssid, String field, String question, String answer) {
		String sql = "INSERT INTO list VALUES('" + ssid + "', '" + field + "', '" 
				+ question + "', '" + answer + "')";
		return executeSql(sql);
	}
	public int delete(String ssid, String field, String question) {
		String sql = "DELETE FROM list WHERE id = '" + ssid + "' AND field = '" + 
						field + "' AND question = '" + question + "'";
		return executeSql(sql);
	}
	
	//DBにsqlを実行するメソッド
	public int executeSql(String sql) {
		Statement stmt = null;
		int result = 0;
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
