package com.laoy.Servcie;

import com.laoy.dao.QueryDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author yueyueyue
 * @date 2019/3/28 12:43
 * Description: spring
 */
@Service("queryCityService")
public class QueryCityService implements QueryDao {
	@Override
	public String query(){
		return "cityService";
	}
}
