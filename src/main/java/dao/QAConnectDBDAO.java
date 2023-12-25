package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class QAConnectDBDAO {
	
	protected String URL = "jdbc:mysql://localhost/qadb";
	protected String USER = "root";
	protected String PASS = "pass";
	
	//DBに接続するメソッド
	protected Connection con = null;
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL, USER, PASS);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//DBから切断するメソッド
	public void disconnect() {
		try {
			if(con != null)con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
