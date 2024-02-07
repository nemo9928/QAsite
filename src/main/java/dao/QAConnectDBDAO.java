package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class QAConnectDBDAO {
	
	private String URL = "jdbc:mysql://localhost/qadb";
	private String USER = "root";
	private String PASS = "pass";
	
	//DBに接続するメソッド
	Connection con = null;
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
