package bean;

import java.io.Serializable;

public class QAAccountBean implements Serializable{
	
	private String id;
	private String pass;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getId() {
		return id;
	}
	public String getPass() {
		return pass;
	}

}
