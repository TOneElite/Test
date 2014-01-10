package org.teamone.controller;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.teamone.domain.PersonJDBCTemplate;
import org.teamone.domain.SubjectJDBCTemplate;



@Controller
public class HomeController {
    
    @Autowired
    private PersonJDBCTemplate personJDBCTemplate;
    
    @Autowired
    private SubjectJDBCTemplate subjectJDBCTemplate;

    @RequestMapping("/*")
    public String testView() {
        return "home";
    }

    @RequestMapping("/password")
    public String passView() {
        return "usersettings";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/passwordReset")
    public String forgotPassword() {
        return "passwordReset";
    }

    @RequestMapping(value = "queueOverlay.htm")
    public String overlay() {
        return "queueOverlay";
    }
    
    @RequestMapping("/testDatabase")
    public String testDatabase(Model model){
	model.addAttribute("persons", personJDBCTemplate.listPerson());
	return "testDatabase";
    }
    @RequestMapping("/testDatabase2")
    public String testDatabase2(Model model){
	model.addAttribute("subjects", subjectJDBCTemplate.listSubjects());
	return "testDatabase2";
    }
}

/*
 @RequestMapping("/database")
 public String databaseView( Model model){
        model.addAttribute("varer", vareJDBCTemplate.listVare());
        return "database";
 }
 */