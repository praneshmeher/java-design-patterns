package com.creational;

public class Singleton3 {
	
	private static Singleton3 obj;
	private Singleton3() {};
	
	public static Singleton3 getInstance() {
		if(obj==null) {
			synchronized (Singleton3.class) {
				if(obj==null)
					obj= new Singleton3();
			}
		}
		return obj;
	}

}
