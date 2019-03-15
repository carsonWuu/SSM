package practice.mybatis.bean;

public class Greeting {
	private String id;
	private String content;
	public Greeting() {
		this.id ="id1";
		this.content="content1";
	}
	public void setId(String id)  {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}
}
