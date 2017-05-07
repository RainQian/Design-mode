package drinkFactory;

public class ColaFactory implements DrinkFactory{

	@Override
	public Drink createDrink() {
		// TODO 自动生成的方法存根
		System.out.println("一份可乐正在生产...");
		return new Cola();
	}

}
