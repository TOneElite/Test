package org.teamone.domain;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserJDBCTemplate {
    
    DataSource dataSource;
    JdbcTemplate jdbcTemplateOjbect;
    
    public void setDataSource(DataSource dataSource){
	this.dataSource = dataSource;
	this.jdbcTemplateOjbect = new JdbcTemplate(dataSource);
    }
    
    public User getUser(int userID){
	String SQL = "";
	User user = (User)jdbcTemplateOjbect.queryForObject(SQL, new Object[]{userID}, new UserMapper());
	return user;
    }
    
    public List<User> listUsers(){
	String SQL = "";
	List<User> user = jdbcTemplateOjbect.query(SQL, new UserMapper());
	return user;
    }
    
}