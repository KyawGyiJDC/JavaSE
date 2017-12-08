package com.solt.kyaw;

public class Main extends Student {
	public String name;
	public Main(String name) {
		this();
		this.name = name;
	}
	public Main() {
		System.out.println("call constrator");
	}
	public static void main(String [] args) {
		Main student = new Main();
		String name = "Thida";
		student.callName("Lwin");
		System.out.println(student.name+name);
	}
	public void callName(String name) {
		System.out.println(name);
		this.name = "kyaw";
	}
}
