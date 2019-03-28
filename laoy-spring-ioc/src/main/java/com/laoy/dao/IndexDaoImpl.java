package com.laoy.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*@Component("indexDao")*/
public class IndexDaoImpl implements IndexDao {

	private String str ;

	@Override
	public void test() {
		System.out.println("impl test0");
		System.out.println(str);
	}



	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
