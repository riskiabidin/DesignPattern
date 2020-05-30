package belajarDesignPattern.BuilderPattern;

public abstract class CoaldDrink implements Item{



	@Override
	public Packing packing() {

		return new Botlle();
	}


}
