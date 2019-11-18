package proxydynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{
	Object o;// 被代理对象
	
	public MyInvocationHandler(Object o) {
		this.o = o;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("MyHandler message.");
		method.invoke(o, args);
		return null;
	}

}
