package com.example.demo.inbound.cardInfo.dao;

import com.example.demo.inbound.cardInfo.bo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    List<User> selectUserByUsername(String passWord);
}