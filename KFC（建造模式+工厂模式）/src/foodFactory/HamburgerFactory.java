package foodFactory;

public class HamburgerFactory implements FoodFactory{

	@Override
	public Food createFood() {
		// TODO 自动生成的方法存根
		System.out.println("一份汉堡正在生产...");
		return new Hamburger();
	}

}
