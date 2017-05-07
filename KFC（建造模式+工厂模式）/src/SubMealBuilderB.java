import drinkFactory.Drink;
import drinkFactory.DrinkFactory;
import drinkFactory.FruitJuiceFactory;
import foodFactory.ChipsFactory;
import foodFactory.Food;
import foodFactory.FoodFactory;

public class SubMealBuilderB extends MealBuilder{

	@Override
	public void bulidFood() {
		// TODO Auto-generated method stub
		FoodFactory foodFactory = new ChipsFactory();
		Food food = foodFactory.createFood();
		super.meal.setFood(food.getFood());
	}

	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		DrinkFactory drinkFactory = new FruitJuiceFactory();
		Drink drink = drinkFactory.createDrink();
		super.meal.setDrink(drink.getDrink());
	}

}
