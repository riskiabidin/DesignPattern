package belajarDesignPattern.FactoryPattern;

public class ShapeFactory {
	public Shape getShape(String ShapeType) {
		
		if(ShapeType==null) {
			return null;
		}else if(ShapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if(ShapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}else if(ShapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}
}
