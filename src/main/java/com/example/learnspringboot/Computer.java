package com.example.learnspringboot;

import org.springframework.stereotype.Component;

@Component("Comp")
public class Computer {
	private String cid;
	private String brand;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Computer [cid=" + cid + ", brand=" + brand + "]";
	}
	
	public void compile() {
		System.out.println("compiling...");
	}

}
