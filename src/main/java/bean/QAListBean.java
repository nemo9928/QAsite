package bean;

import java.io.Serializable;

public class QAListBean implements Serializable{
	
	private String id;
	private String field;
	private String question;
	private String answer;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setField(String field) {
		this.field = field;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getId() {
		return id;
	}
	public String getField() {
		return field;
	}
	public String getQuestion() {
		return question;
	}
	public String getAnswer() {
		return answer;
	}
}
