package com.cg.rpa.dao;

import com.cg.rpa.model.Login;
import com.cg.rpa.model.User;

public interface UserService {
	void register(User user);

	User validateUser(Login login);
}