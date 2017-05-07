package foodFactory;

public class ChipsFactory implements FoodFactory{

	@Override
	public Food createFood() {
		System.out.println("一份薯片正在生产...");
		return new Chips();
	}

}
