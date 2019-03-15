package practice.mybatis.bean;

public class User {
    private Integer id;
    private String name;

    private Integer age;
    
    public void setAge(Integer age) {
    	this.age = age;
    }
    public Integer getAge() {
    	return this.age;
    }
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getName() {
        return this.name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
   
 
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                  ",age="+ this.age+""
                +
                '}';
    }
}