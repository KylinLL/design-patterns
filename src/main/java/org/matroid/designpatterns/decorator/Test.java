package org.matroid.designpatterns.decorator;

public class Test {

	public static void main(String[] args) {
		IRole r = new Gunmen("枪手");
		IWeapon w = new Gun("火箭枪");
		r.attack(w);
		w = new Ruby(w, 2);
		r.attack(w);
	}

}
