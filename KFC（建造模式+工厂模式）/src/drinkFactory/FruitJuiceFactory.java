package drinkFactory;

public class FruitJuiceFactory implements DrinkFactory{

	@Override
	public Drink createDrink() {
		// TODO �Զ����ɵķ������
		System.out.println("һ�ݹ�֭��������...");
		return new FruitJuice();
	}

}
