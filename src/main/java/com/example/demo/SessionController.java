package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class SessionController {

    @RequestMapping("/getSessionValue")
    public String getSessionValue(HttpServletRequest request){
        return (String)  request.getSession(true).getAttribute("user");
    }

    @RequestMapping("/setSessionValue")
    public void addSession(HttpServletRequest request){
        request.getSession(true).setAttribute("user","admin");
    }
}
