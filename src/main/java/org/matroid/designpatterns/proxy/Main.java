package org.matroid.designpatterns.proxy;

import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		staticProxy();
		dynamicProxy();
	}

	/**
	 * 静态代理
	 */
	private static void staticProxy() {
		Star real = new RealStar();
		Star proxy = new ProxyStar(real);
		proxy.contract();
		proxy.show();
		proxy.chargeRetainage();
	}

	/**
	 * 动态代理
	 */
	private static void dynamicProxy() {
		Star realStar = new RealStar();
		StarHandler handler = new StarHandler(realStar);
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] { Star.class },
				handler);
		proxy.show();
	}

}
