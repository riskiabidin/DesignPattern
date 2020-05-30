package belajarDesignPattern.AbstractFactory;

public class ShapeFactory extends AbstractFactory {


	@Override
	Colors getColors(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		
		if(shapeType==null) {
			return null;
		} else if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		} else if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}

}
