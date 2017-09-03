package org.matroid.designpatterns.observer;

/**
 * 具体观察者
 * 
 * @author kylin
 *
 */
public class ConcreteObserver implements Observer {

	private String name;

	public ConcreteObserver(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println(name + "接收到消息：" + message);
	}

}
