package foodFactory;

public class HamburgerFactory implements FoodFactory{

	@Override
	public Food createFood() {
		// TODO �Զ����ɵķ������
		System.out.println("һ�ݺ�����������...");
		return new Hamburger();
	}

}
