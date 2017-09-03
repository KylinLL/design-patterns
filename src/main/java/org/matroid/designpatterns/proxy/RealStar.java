package org.matroid.designpatterns.proxy;

/**
 * 艺人本人
 * 
 * @author kylin
 *
 */
public class RealStar implements Star {

	@Override
	public void contract() {
		System.out.println("RealStar.contract()");
	}

	@Override
	public void show() {
		System.out.println("RealStar.show()");
	}

	@Override
	public void chargeRetainage() {
		System.out.println("RealStar.chargeRetainage()");
	}

}
