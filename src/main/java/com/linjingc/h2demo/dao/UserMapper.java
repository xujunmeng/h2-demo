package com.linjingc.h2demo.dao;

import com.linjingc.h2demo.entity.BasicUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author cxc
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    BasicUser findUser(String name);

    @Insert("INSERT INTO USER(NAME, PASSWORD, AGE) VALUES(#{name}, #{password}, #{age})")
    int insert(@Param("name") String name, @Param("password") String password, @Param("age") Integer age);

}
