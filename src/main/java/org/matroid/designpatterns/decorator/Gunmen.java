package org.matroid.designpatterns.decorator;

public class Gunmen implements IRole {

	private String name;

	public Gunmen(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void attack(IWeapon weapon) {
		System.out.println(this.name + "使用" + weapon.getName() + "进行攻击，造成的伤害值为：" + weapon.getAttack());
	}

}
