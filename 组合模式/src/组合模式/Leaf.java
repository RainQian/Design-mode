package 组合模式;

public class Leaf extends Component{

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("叶子节点没有此功能");
	}

	@Override
	public int Function(int n) {
		System.out.println("叶子里面的n为："+n);
		return n<=1?1:Function(n-1)*n;
	}

}
