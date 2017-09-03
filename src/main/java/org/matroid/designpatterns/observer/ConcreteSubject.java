package org.matroid.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题类
 * 
 * @author kylin
 *
 */
public class ConcreteSubject implements Subject {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notify(String message) {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}

}
