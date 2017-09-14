package com.mw.scouting.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScoutingController {
        @GetMapping("/")
        public String home(){return "index";}

        @GetMapping("/login")
        public String login(){return "login";}

        @GetMapping("/hello")
        public String hello(){return "hello";}
}
