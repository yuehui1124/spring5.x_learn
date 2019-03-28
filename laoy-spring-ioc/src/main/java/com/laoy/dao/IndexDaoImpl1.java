package com.laoy.dao;

/*@Component("indexDao")*/
public class IndexDaoImpl1 implements IndexDao {

	private String str ;

	@Override
	public void test() {
		System.out.println("impl test1");
		System.out.println(str);
	}



	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
