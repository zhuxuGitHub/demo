package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class bb {

    @RequestMapping(value="/mcsrBfw",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public  String as(){

        return "index";
    }
}
