package ���ģʽ;

public class Leaf extends Component{

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		System.out.println("Ҷ�ӽڵ�û�д˹���");
	}

	@Override
	public int Function(int n) {
		System.out.println("Ҷ�������nΪ��"+n);
		return n<=1?1:Function(n-1)*n;
	}

}
