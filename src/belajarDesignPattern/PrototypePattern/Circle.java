package belajarDesignPattern.PrototypePattern;

public class Circle extends Shape {

	
	public Circle() {
		type="Cicle";
	}
	@Override
	void draw() {
		System.out.println("Inside Circle::draw() method");
		
	}

}
