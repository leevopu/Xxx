package test;

import java.util.List;

public class User {
	private String id;
	private String name;
	private List<String> array;
	private String url;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<String> getArray() {
		return array;
	}
	public void setArray(List<String> array) {
		this.array = array;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
