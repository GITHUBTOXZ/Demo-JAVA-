package com.example.demo.dao;

import com.example.demo.entity.User;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    int countByExample();

    int deleteByName(String name);

    int insert(User record);


    List<User> selectByName(String name);

    int update(@Param(value = "list") List<User> list);
}