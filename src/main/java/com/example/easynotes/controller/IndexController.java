package com.example.easynotes.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "<h4>Hello Everyone, Good Morning ...!!</h4>"
        		+ "<h3>Welcome to Infusing Security tools within Software Development.</h3><br/>"
        		+ "<li>You could create a new Note by making a POST request to /api/notes endpoint using <a href='https://www.getpostman.com/apps' target='_blank'>POSTMAN</a>.</li>";
    }
}
