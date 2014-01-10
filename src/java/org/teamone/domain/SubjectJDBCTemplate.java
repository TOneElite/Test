package org.teamone.domain;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class SubjectJDBCTemplate {
    
    DataSource dataSource;
    JdbcTemplate jdbcTemplateOjbect;
    
    public void setDataSource(DataSource dataSource){
	this.dataSource = dataSource;
	this.jdbcTemplateOjbect = new JdbcTemplate(dataSource);
    }
    
    public Subject getSubject(int subjectCode){
	String SQL = "select * from fag where fagkode=?";
	Subject subject = (Subject)jdbcTemplateOjbect.queryForObject(SQL, new Object[]{subjectCode}, new SubjectMapper());
	return subject;
    }
    
    public List<Subject> listSubjects(){
	String SQL = "select * from fag";
	List<Subject> subjects = jdbcTemplateOjbect.query(SQL, new SubjectMapper());
	return subjects;
    }
    
}

/*
 public class VareJDBCTemplate {
    
    DataSource dataSource;
    JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    
    public Vare getVare(int varenr){
        String SQL = "select * from vare where varenr = ?";
        Vare vare = (Vare)jdbcTemplateObject.queryForObject(SQL, new Object[]{varenr}, new VareMapper());
        return vare;
    }
    
    public List<Vare> listVare(){
        String SQL = "SELECT * FROM vare order by varenavn";
        List<Vare> varer = jdbcTemplateObject.query(SQL, new VareMapper());
        return varer;
    }

    public void delete(int id) {
        String SQL = "delete from vare where varenr = ?";
        jdbcTemplateObject.update(SQL, id);
    }
    
    public void update(Vare vare){
        String SQL = "update vare set varenavn=?, pris=? where varenr=?";
        jdbcTemplateObject.update(SQL, new Object[]{
            vare.getNavn(),
            vare.getPris(),
            vare.getId()
        });
    }
    
    public void create(Vare vare){
        String SQL = "insert into vare(varenavn, pris) values(?,?)";
        jdbcTemplateObject.update(SQL, new Object[]{vare.getNavn(), vare.getPris()});
    }
    
}
* 
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

 */