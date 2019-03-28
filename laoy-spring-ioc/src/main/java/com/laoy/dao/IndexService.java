package com.laoy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*@Service*/
public class IndexService {
	//@Autowired
	private IndexDao dao;
	//set方法注入
	public void setDao1(IndexDao dao) {
		this.dao = dao;
	}

	//构造方法注入
	/*public IndexService(IndexDao dao){
		this.dao = dao;
	}*/

	public void service(){
		dao.test();
	}
}
