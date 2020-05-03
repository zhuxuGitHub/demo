package com.example.demo.inbound.cardInfo.service;

import com.example.demo.inbound.cardInfo.bo.User;
import com.example.demo.inbound.cardInfo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cardInfo.UserService")
public class UserService {
    @Autowired
    @Qualifier("cardInfo.UserDao")
    UserDao userDao;

    public List<User> selectUserByUsername(String passWord) {
        return userDao.selectUserByUsername(passWord);
    }
    public List<User> selectUserByUserA(){
        return userDao.selectUserByUserA();
    }

    public void addUser(User user){
       userDao.addUser(user);
    }
}
