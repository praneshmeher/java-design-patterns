package creational;

public class Singleton2 {
	
	private static Singleton2 obj;
	private Singleton2() {};
	
	static {
		obj= new Singleton2();
	}
}
