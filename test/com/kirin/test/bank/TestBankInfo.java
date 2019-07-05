package com.kirin.test.bank;


import com.kirin.bank.BankInfo;
import com.kirin.bean.UserBean;

import junit.framework.TestCase;

public class TestBankInfo extends TestCase{

	
	
	public void test_bank_getUser() {
		UserBean user = BankInfo.getUserBean();
		String id = user.getId();
		
		System.out.println(id );
	}
	
}
