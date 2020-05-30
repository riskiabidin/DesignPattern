package belajarDesignPattern.BuilderPattern;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal=new Meal();
		meal.add(new VegBurger());
		meal.add(new Pepsi());
		return meal;
	}
	public Meal PrepareNonVegMeal() {
		Meal meal=new Meal();
		meal.add(new ChickenBurger());
		meal.add(new Coke());
		return meal;
	}
}
