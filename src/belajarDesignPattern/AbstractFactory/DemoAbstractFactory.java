package belajarDesignPattern.AbstractFactory;

public class DemoAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory shapeFactory=FactoryProducer.getFactory("SHAPE");
		Shape shape1=shapeFactory.getShape("Circle");
		shape1.draw();
		Shape shape2=shapeFactory.getShape("Rectangle");
		shape2.draw();
		Shape shape3=shapeFactory.getShape("Square");
		shape3.draw();
		AbstractFactory colorsFactory=FactoryProducer.getFactory("COLOR");
		Colors color1=colorsFactory.getColors("Blue");
		color1.fill();
		Colors color2=colorsFactory.getColors("Green");
		color2.fill();
		Colors color3=colorsFactory.getColors("Red");
		color3.fill();

	}

}
