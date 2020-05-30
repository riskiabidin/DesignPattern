package belajarDesignPattern.BuilderPattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder mealBuilder=new MealBuilder();
		Meal vegMeal=mealBuilder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println("Total cost"+vegMeal.getCost());
		
		System.out.println("========");
		
		Meal nonVegMeal=mealBuilder.PrepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println("Total cost"+nonVegMeal.getCost());
		

	}

}
