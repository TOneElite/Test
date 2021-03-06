package org.teamone.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.teamone.domain.QueueJDBCTemplate;
import org.teamone.domain.UserJDBCTemplate;
import org.teamone.domain.SubjectJDBCTemplate;
import org.teamone.domain.Queue;

@Controller
public class HomeController {

    @Autowired
    private UserJDBCTemplate personJDBCTemplate;
    @Autowired
    private SubjectJDBCTemplate subjectJDBCTemplate;
    @Autowired
    QueueJDBCTemplate queueJDBCTemplate;

    @RequestMapping("/*")
    public String testView(Model model) {
        model.addAttribute("queues", queueJDBCTemplate.listQueue());
        return "home";
    }
    /*
     * 
     @RequestMapping("/*")
     public String testView() {
     return "home";
     }
     */

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

    @RequestMapping("/testDatabase")
    public String testDatabase(Model model) {
        model.addAttribute("persons", personJDBCTemplate.listUsers());
        return "testDatabase";
    }

    @RequestMapping("/testDatabase2")
    public String testDatabase2(Model model) {
        model.addAttribute("subjects", subjectJDBCTemplate.listSubjects());
        return "testDatabase2";
    }

    @RequestMapping("/teacherQueue")
    public String teacherQueue(Model model) {
        model.addAttribute("queues", queueJDBCTemplate.listQueue());
        return "teacherQueue";
    }

    @RequestMapping("/approveInQueue")
    public String approveInQueue() {
        return "approveInQueue";
    }

    @RequestMapping("/eksamensrapport")
    public String examOverview() {
        return "eksamensrapport";
    }
}
