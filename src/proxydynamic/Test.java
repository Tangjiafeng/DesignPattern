package proxydynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * �ڲ��ı�ԭ�д��������£�������ʵ������ӿڵ��������������ִ��ǰ���ܵĴ���
 * @author A
 *
 */
public class Test {
	public static void main(String[] args) {
		Car car = new Car();// ������
		InvocationHandler handler = new MyInvocationHandler(car);// ���������
		// ����ӿڣ�����������
		Movable m = (Movable) Proxy
				.newProxyInstance(Movable.class.getClassLoader(), new Class<?>[] { Movable.class }, handler);		
		m.move();
		m.stop();
	}

}
