package belajarDesignPattern.BuilderPattern;

public abstract class Burger implements Item{



	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}


}
