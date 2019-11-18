package proxystatic;

public class TankLogProxy implements Movable {
	Movable t;
	
	public TankLogProxy(Movable t) {// ¾ÛºÏ¹ØÏµ£¬has-a
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
