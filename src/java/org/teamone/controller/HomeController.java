package org.teamone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.teamone.domain.PersonJDBCTemplate;



@Controller
public class HomeController {
    
    @Autowired
    private PersonJDBCTemplate personJDBCTemplate;

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
	model.addAttribute("person", personJDBCTemplate.getPerson(123));
	return "testDatabase";
    }
}

/*
 @RequestMapping("/database")
 public String databaseView( Model model){
        model.addAttribute("varer", vareJDBCTemplate.listVare());
        return "database";
 }
 */