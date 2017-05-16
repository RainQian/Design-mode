package 组合模式;

import java.util.ArrayList;
public class Composite extends Component{
	private ArrayList<Component> list =new ArrayList<>();
	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		list.add(c);
	}

	@Override
	public int Function(int n) {
		// TODO Auto-generated method stub
		for(Object object:list){
			int result = ((Component)object).Function(n);
			System.out.println(n+"的阶乘为："+result);
		}
		return 0;
	}

}
