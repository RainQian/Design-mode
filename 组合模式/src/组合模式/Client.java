package 组合模式;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component obj1=new Leaf();
		Composite composite1 = new Composite();
		composite1.add(obj1);
		System.out.println("请输入想要求得的阶乘数：");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		scanner.close();
		composite1.Function(m);
	}

}
