package belajarDesignPattern.AbstractFactory;

public abstract class  AbstractFactory {
	abstract Colors getColors(String colorType);
	abstract Shape getShape(String shapeType);
}
