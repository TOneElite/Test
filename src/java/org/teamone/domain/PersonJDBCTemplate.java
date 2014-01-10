package org.teamone.domain;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class PersonJDBCTemplate {
    
    DataSource dataSource;
    JdbcTemplate jdbcTemplateOjbect;
    
    public void setDataSource(DataSource dataSource){
	this.dataSource = dataSource;
	this.jdbcTemplateOjbect = new JdbcTemplate(dataSource);
    }
    
    public Person getPerson(int personID){
	String SQL = "select * from person where person_id=?";
	Person person = (Person)jdbcTemplateOjbect.queryForObject(SQL, new Object[]{personID}, new PersonMapper());
	return person;
    }
    
    public List<Person> listPerson(){
	String SQL = "select * from person";
	List<Person> persons = jdbcTemplateOjbect.query(SQL, new PersonMapper());
	return persons;
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