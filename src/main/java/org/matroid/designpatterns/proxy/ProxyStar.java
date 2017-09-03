package org.matroid.designpatterns.proxy;

/**
 * 艺人代理
 * 
 * @author kylin
 *
 */
public class ProxyStar implements Star {

	private Star realStar;

	public ProxyStar(Star realStar) {
		this.realStar = realStar;
	}

	@Override
	public void contract() {
		System.out.println("ProxyStar.contract()");
	}

	@Override
	public void show() {
		realStar.show(); // 艺人本人演出
	}

	@Override
	public void chargeRetainage() {
		System.out.println("ProxyStar.chargeRetainage()");
	}

}
