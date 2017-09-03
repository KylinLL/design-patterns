package org.matroid.designpatterns.decorator;

public class Gun implements IWeapon {

	private String name;

	public Gun(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAttack() {
		return 200;
	}

}
