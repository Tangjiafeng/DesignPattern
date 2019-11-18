package proxystatic;

public class TankRuntimeProxy implements Movable {
	Movable t;
	
	public TankRuntimeProxy(Movable t) {// ¾ÛºÏ¹ØÏµ£¬has-a
		super();
		this.t = t;
	}

	@Override
	public void move() {
		float start = System.currentTimeMillis();
		t.move();
		float end = System.currentTimeMillis();

		System.out.println("Tank runtime: " + (end - start));
	}

}
