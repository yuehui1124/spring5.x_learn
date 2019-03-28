package com.laoy.Servcie;

import com.laoy.dao.QueryDao;
import org.springframework.stereotype.Service;

/**
 * @author yueyueyue
 * @date 2019/3/28 12:44
 * Description: spring
 */
@Service
public class QueryUserService implements QueryDao {

	@Override
	public String query() {
		return "userService";
	}
}
