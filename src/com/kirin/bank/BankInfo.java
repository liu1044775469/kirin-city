package com.kirin.bank;

import com.kirin.bean.UserBean;

public class BankInfo {
	
	private static UserBean userBean ;
	
	public static UserBean getUserBean() {
		synchronized (BankInfo.class) {
			if(userBean  == null) {
				userBean = new UserBean();
			}
		}
		return userBean;
	}

	public static void setUserBean(UserBean userBean) {
		BankInfo.userBean = userBean;
	}
}
