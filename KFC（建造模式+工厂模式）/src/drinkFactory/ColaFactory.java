package drinkFactory;

public class ColaFactory implements DrinkFactory{

	@Override
	public Drink createDrink() {
		// TODO �Զ����ɵķ������
		System.out.println("һ�ݿ�����������...");
		return new Cola();
	}

}
