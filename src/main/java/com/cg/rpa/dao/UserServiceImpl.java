package com.cg.rpa.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cg.rpa.model.Login;
import com.cg.rpa.model.RpaPipelineMaster;
import com.cg.rpa.model.User;

	

public class UserServiceImpl implements UserDao {
	/*@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;
*/
	public void register(User user) {
		/*String sql = "insert into users values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
				user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });*/
	}

	public User validateUser(Login login) {
		/*String sql = "select * from users where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";
		List<User> users = jdbcTemplate.query(sql, new UserMapper());
		return users.size() > 0 ? users.get(0) : null;*/
		return new User();
	}

	@Override
	public User registerDeal(RpaPipelineMaster rpaPipelineMaster) {
		return new User();
		
	}
}


