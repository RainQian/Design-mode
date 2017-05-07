import drinkFactory.ColaFactory;
import drinkFactory.Drink;
import drinkFactory.DrinkFactory;
import foodFactory.Food;
import foodFactory.FoodFactory;
import foodFactory.HamburgerFactory;

public class SubMealBuilderA extends MealBuilder {

	@Override
	public void bulidFood() {
		// TODO Auto-generated method stub
		FoodFactory foodFactory = new HamburgerFactory();
		Food food = foodFactory.createFood();
		super.meal.setFood(food.getFood());
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		DrinkFactory drinkFactory = new ColaFactory();
		Drink drink = drinkFactory.createDrink();
		super.meal.setDrink(drink.getDrink());
	}

}
