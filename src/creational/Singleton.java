package creational;

public class Singleton {
	
	private static Singleton obj;
	private Singleton() {};
	
	synchronized public static Singleton getSingleton() {
		if(obj==null)
			obj = new Singleton();
		return obj;
	}
}
