package com.fm.controller;

import com.fm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;
    @RequestMapping("/getPerson")
    @ResponseBody
    public String getPerson() {
        return personService.getPerson().toString();
    }
}
