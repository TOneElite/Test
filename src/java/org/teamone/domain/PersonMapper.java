package org.teamone.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class PersonMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int i) throws SQLException {
	Person person = new Person();
	person.setId(rs.getInt("person_id"));
	person.setFirstName(rs.getString("first_name"));
	person.setSurname(rs.getString("surname"));
	person.setEmail(rs.getString("email"));
	person.setPassword(rs.getString("password"));
	return person;
    }
    
}