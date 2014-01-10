package org.teamone.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
	User user = new User();
	user.setId(rs.getInt(""));
	user.setFirstName(rs.getString(""));
	user.setSurname(rs.getString(""));
	user.setEmail(rs.getString(""));
	user.setPassword(rs.getString(""));
	return user;
    }
    
}