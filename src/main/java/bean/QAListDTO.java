package bean;

import java.io.Serializable;
import java.util.ArrayList;

public class QAListDTO implements Serializable{
	
	private ArrayList<QAListBean> list;
	
	public QAListDTO(){
		list = new ArrayList<QAListBean>();
	}
	
	public void add(QAListBean listbean) {
		list.add(listbean);
	}
	
	public QAListBean get(int i) {
		return list.get(i);
	}
	
	public int size() {
		return list.size();
	}
}
