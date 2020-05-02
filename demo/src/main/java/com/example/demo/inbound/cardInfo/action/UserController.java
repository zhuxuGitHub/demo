package com.example.demo.inbound.cardInfo.action;

import com.example.demo.inbound.cardInfo.bo.User;
import com.example.demo.inbound.cardInfo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    HttpServletRequest request;

    @RequestMapping(value="/mcsr",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<User> selectUser() {
        String passWord = request.getHeader("passWord");
        List<User> users = userService.selectUserByUsername(passWord);
        return users;
    }

    @RequestMapping(value="/mcsrA",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<User> selectUserA() {
        List<User> users = userService.selectUserByUserA();
        return users;
    }
}
