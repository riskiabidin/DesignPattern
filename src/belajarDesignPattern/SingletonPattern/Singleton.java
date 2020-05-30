package belajarDesignPattern.SingletonPattern;

public class Singleton {
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		if(singleton==null)
		{
			singleton=new Singleton();
		}
		return singleton;
	}
	protected static void testMethod() {
		System.out.println("singleton pattern");
	}
	protected static void testMethod2() {
		System.out.println("singleton patterns");
	}
}
