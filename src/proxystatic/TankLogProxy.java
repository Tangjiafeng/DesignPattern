package proxystatic;

public class TankLogProxy implements Movable {
	Movable t;
	
	public TankLogProxy(Movable t) {// �ۺϹ�ϵ��has-a
		super();
		this.t = t;
	}

	@Override
	public void move() {
		System.out.println("Tank start...");
		t.move();
		System.out.println("Tank stop.");
	}

}
