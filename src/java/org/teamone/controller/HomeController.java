package org.teamone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/*")
    public String testView(){
	return "home";
    }
}

/*
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    
    @RequestMapping("/*")
    public String homeView(){
        return "index";
    }
    
    @RequestMapping("/home")
    public String homeView2(){
        return homeView();
    }
    
}

 */