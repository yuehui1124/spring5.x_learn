package com.laoy.dao;

import org.springframework.stereotype.Repository;

@Repository("indexDao")
public class IndexDao { //implements Dao
	//@Override
	public void query() {
		System.out.println("hello aop");
	}
}
