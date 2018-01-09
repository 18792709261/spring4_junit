package zr.xuexi.bean;



public class User2 {
	
	
	private String name;
	private int age;
	
	
	public User2() {
		//当spirng容器开始创建bean对象User打印
		System.out.println("开始创建");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
