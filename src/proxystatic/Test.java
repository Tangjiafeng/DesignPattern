package proxystatic;

public class Test {
	public static void main(String[] args) {		
		Movable m = new TankRuntimeProxy(new Tank());
		Movable l = new TankLogProxy(m);// ����ʱ�䣬��־��Ӳ����Ĵ�����˳��
		m.move();
		System.out.println("-----------------�ָ���");
		l.move();
	}
}
