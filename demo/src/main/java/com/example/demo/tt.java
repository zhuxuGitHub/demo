package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tt {
    @RequestMapping(value="/mcsr",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public  String as(){

        return "index11";
    }

}
