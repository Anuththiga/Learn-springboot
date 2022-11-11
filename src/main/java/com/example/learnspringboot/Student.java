package com.example.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//this annotation will make this as spring bean and we can use this anywhere
@Component

//@Scope(value = "prototype")

public class Student {
	
	private String sid;
	private String name;
	private int age;
	@Autowired
	
	//this will search by the name
	@Qualifier("Comp")
	private Computer computer;
	
		
	public Student() {
		super();
		System.out.println("Object created...");
	}
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
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
	
	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	

	public void show() {
		System.out.println("in show");
		computer.compile();
	}

}
