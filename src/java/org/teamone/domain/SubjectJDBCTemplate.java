package org.teamone.domain;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class SubjectJDBCTemplate {

    DataSource dataSource;
    JdbcTemplate jdbcTemplateOjbect;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateOjbect = new JdbcTemplate(dataSource);
    }

    public Subject getSubject(int subjectCode) {
        String SQL = "SELECT * FROM subject WHERE code=?";
        Subject subject = (Subject) jdbcTemplateOjbect.queryForObject(SQL, new Object[]{subjectCode}, new SubjectMapper());
        return subject;
    }

    public List<Subject> listSubjects() {
        String SQL = "SELECT * FROM subject";
        List<Subject> subjects = jdbcTemplateOjbect.query(SQL, new SubjectMapper());
        return subjects;
    }
}