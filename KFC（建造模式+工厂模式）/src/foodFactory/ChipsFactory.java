package foodFactory;

public class ChipsFactory implements FoodFactory{

	@Override
	public Food createFood() {
		System.out.println("һ����Ƭ��������...");
		return new Chips();
	}

}
