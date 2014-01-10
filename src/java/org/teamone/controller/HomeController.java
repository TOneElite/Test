package org.teamone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

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
}
