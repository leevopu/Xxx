package test;

import java.util.List;

public class User {
	private String id;
	private String name;
	private List<String> array;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setArray(List<String> array) {
		this.array = array;
	}
	public void setId(String id) {
		this.id = id;
	}
}
