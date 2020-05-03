package com.example.demo.inbound.cardInfo.dao;

import com.example.demo.inbound.cardInfo.bo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper //注解标记这个接口作为一个映射接口
@Repository("cardInfo.UserDao")
public interface UserDao {
    List<User> selectUserByUsername(String passWord);
    @Select("SELECT * FROM tt_user" )
    List<User> selectUserByUserA();

    @Select("SELECT * FROM tt_user where passWord=#{passWord}")
    List<User> selectUserByUserpassWord(String passWord);


    @Insert("insert into student(id,name,passWord) " +
            "values(#{id},#{name},#{passWord})")
    void addUser(User user);
}