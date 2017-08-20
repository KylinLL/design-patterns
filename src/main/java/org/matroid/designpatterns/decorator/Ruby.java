package org.matroid.designpatterns.decorator;

public class Ruby extends Decorator {

	private IWeapon weapon;
	private int amount = 1;

	public Ruby(IWeapon weapon) {
		super();
		this.weapon = weapon;
	}

	public Ruby(IWeapon weapon, int amount) {
		super();
		this.weapon = weapon;
		this.amount = amount;
	}

	public String getName() {
		if (amount == 1)
			return "增加了红宝石的" + weapon.getName();
		return "增加了红宝石 x " + amount + "的" + weapon.getName();
	}

	@Override
	public int getAttack() {
		return 5 * amount + weapon.getAttack();
	}

}
