package com.example.demo.inbound.cardInfo.action;

import com.example.demo.inbound.cardInfo.bo.User;
import com.example.demo.inbound.cardInfo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@RestController//@Controller和@ResponseBody（返回json串）
public class UserController {
    //@Autowired
    //@Qualifier("cardInfo.UserService")
    @Resource(name="cardInfo.UserService") //javaEE 自带
    public UserService userService;

    @Autowired
    public HttpServletRequest request;

    @RequestMapping(value = "/mcsr", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<User> selectUser() {
        String passWord = request.getHeader("passWord");
        log.info("上送项:" + passWord);
        List<User> users = userService.selectUserByUsername(passWord);
        return users;
    }

    @RequestMapping(value = "/mcsrA", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody //返回转换成json
    public List<User> selectUserA() {

        List<User> users = userService.selectUserByUserA();
        return users;
    }
    @RequestMapping(value = "/mcsrB", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody //返回转换成json
    //@RequestBody 接受的是一个json格式的字符串，一定是一个字符串
    public String  addUser(@RequestBody User  user) {
       /* {"passWord":"6",
                "name":"6",
                "id":"68"}*/
        log.info(user.toString());
        userService.addUser(user);
        return "ok";
    }
}
