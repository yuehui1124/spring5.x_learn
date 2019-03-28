package com.laoy.dao;

public class IndexDaoImpl2 implements IndexDao {

	private String str2;

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	@Override
	public void test() {
		System.out.println("indexDaoImpl2");
	}
}
