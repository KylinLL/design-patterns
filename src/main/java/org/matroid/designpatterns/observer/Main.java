package org.matroid.designpatterns.observer;

public class Main {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		
		ConcreteObserver observer1 = new ConcreteObserver("Alice");
		ConcreteObserver observer2 = new ConcreteObserver("David");
		ConcreteObserver observer3 = new ConcreteObserver("James");
		
		subject.attach(observer1);
		subject.attach(observer2);
		subject.attach(observer3);
		
		subject.notify("冰与火之歌更新了");
	}

}
