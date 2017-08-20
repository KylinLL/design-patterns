package org.matroid.designpatterns.singleton;

/**
 * 单例模式
 * 
 * @author kylin
 *
 */
public class Singleton {

	private static final Singleton INSTANCE = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}

}
