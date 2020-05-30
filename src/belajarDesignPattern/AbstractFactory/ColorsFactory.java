package belajarDesignPattern.AbstractFactory;

public class ColorsFactory  extends AbstractFactory{

	@Override
	Colors getColors(String colorType) {
		if(colorType==null) {
			return null;
		} else if(colorType.equalsIgnoreCase("Blue")) {
			return new Blue();
		}else if(colorType.equalsIgnoreCase("Green")) {
			return new Green();
		}else if(colorType.equalsIgnoreCase("Red")) {
			return new Red();
		}
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
