package drinkFactory;

public class FruitJuiceFactory implements DrinkFactory{

	@Override
	public Drink createDrink() {
		// TODO 自动生成的方法存根
		System.out.println("一份果汁正在生产...");
		return new FruitJuice();
	}

}
