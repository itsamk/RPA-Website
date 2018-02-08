package com.cg.rpa.dao;

import com.cg.rpa.model.Login;
import com.cg.rpa.model.RpaPipelineMaster;
import com.cg.rpa.model.User;

public interface UserDao {
	void register(User user);

	User validateUser(Login login);
	
	User registerDeal(RpaPipelineMaster rpaPipelineMaster);
}