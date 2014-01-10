package org.teamone.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class SubjectMapper implements RowMapper<Subject> {

    @Override
    public Subject mapRow(ResultSet rs, int i) throws SQLException {
	Subject subject = new Subject();
	subject.setCode(rs.getInt(""));
	subject.setName(rs.getString(""));
	subject.setStatus(rs.getInt(""));
	return subject;
    }
    
}