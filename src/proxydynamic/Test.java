package proxydynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 在不改变原有代码的情况下，可以在实现任意接口的任意类加入任意执行前后功能的处理。
 * @author A
 *
 */
public class Test {
	public static void main(String[] args) {
		Car car = new Car();// 任意类
		InvocationHandler handler = new MyInvocationHandler(car);// 任意代理功能
		// 任意接口，产生代理类
		Movable m = (Movable) Proxy
				.newProxyInstance(Movable.class.getClassLoader(), new Class<?>[] { Movable.class }, handler);		
		m.move();
		m.stop();
	}

}
