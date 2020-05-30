package belajarDesignPattern;

public class Singleton {
	
	//instantiasi singleton
	private static Singleton singleton=new Singleton();
	
	
	
	
	//constructor mode private agar tidak dapat diinstansiasi oleh class lain 
	private Singleton() {
	
	}

	public static Singleton getInstanceSingleton() {
	
		//instansi singleton
		return singleton;
	}
	//method turunan yang dapat diagunakan oleh singleton
	protected static void testMetod() {
		System.out.println("Testing method Singleton1");
	}

	
	
}
