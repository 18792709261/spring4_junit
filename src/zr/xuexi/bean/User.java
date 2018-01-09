package zr.xuexi.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component// 可被spring发现
@ComponentScan//spring扫描可发现的@Component的类
public class User {
	
	@Value("提莫")//变量注入值
	private String name;
	
	@Value("23")//变量注入值
	private int age;
	
	
	public User() {
		//当spirng容器开始创建对象User打印
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
