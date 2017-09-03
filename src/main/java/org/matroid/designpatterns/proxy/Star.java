package org.matroid.designpatterns.proxy;

/**
 * 抽象角色：提供代理角色和真实角色对外提供的公共方法
 * 
 * @author kylin
 *
 */
public interface Star {

	/**
	 * 签约
	 */
	void contract();

	/**
	 * 演出
	 */
	void show();

	/**
	 * 收尾款
	 */
	void chargeRetainage();

}
