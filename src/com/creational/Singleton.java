package com.creational;

public class Singleton {
	
	private static Singleton obj;
	private Singleton() {
		System.out.println("Singleton");
	};
	
	public static synchronized Singleton getSingleton() {
		if(obj==null)
			obj = new Singleton();
		return obj;
	}
}
