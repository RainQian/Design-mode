import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		System.out.println("请选择套餐类型：(A(可乐和薯条)或者B(果汁和汉堡包))");
		@SuppressWarnings("resource")
		Scanner scanner  = new Scanner(System.in);
		String string = null;
		char choose  = scanner.next().charAt(0);
		switch (choose) {
		case 'A':
			SubMealBuilderA builderA = new SubMealBuilderA();
			KFCWaiter waiterA = new KFCWaiter(builderA);
			waiterA.setMealBuilder(builderA);
			Meal mealA = waiterA.construct();
			string = mealA.getFood()+", "+mealA.getDrink();
			break;
		case'B':
			SubMealBuilderB builderB = new SubMealBuilderB();
			KFCWaiter waiterB = new KFCWaiter(builderB);
			waiterB.setMealBuilder(builderB);
			Meal mealB = waiterB.construct();
			string = mealB.getFood()+", "+mealB.getDrink();
			break;
		default:
			System.out.println("对不起，这里没有你所选择的套餐");
			break;
			
		}
		if(string==null)
		{
			return;
		}else{
			System.out.println("您的"+string+"已准备好");	
		}
	}
}
