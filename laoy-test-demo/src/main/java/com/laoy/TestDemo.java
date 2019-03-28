package com.laoy;

import com.laoy.Servcie.QueryCityService;
import com.laoy.dao.QueryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author yueyueyue
 * @date 2019/3/28 12:46
 * Description: spring
 */
@Component
public class TestDemo {
	private QueryDao queryDao;

	@Autowired
	@Qualifier("queryCityService")
	public void setQueryDao(QueryDao queryDao){

		this.queryDao = queryDao;
	}

	public String test() {
		return queryDao.query();
	}


}
