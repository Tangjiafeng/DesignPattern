package proxystatic;

public class Test {
	public static void main(String[] args) {		
		Movable m = new TankRuntimeProxy(new Tank());
		Movable l = new TankLogProxy(m);// 代理时间，日志，硬编码的代理功能顺序
		m.move();
		System.out.println("-----------------分隔线");
		l.move();
	}
}
