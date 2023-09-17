package com.example.mysql_springboot.mapper;

import com.example.mysql_springboot.entity.User2;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
//public interface UserMapper extends BaseMapper<User2> {
//    @Select("select * from user")
//    public List<User2> find();
//
//    @Insert("insert into user values  (#{username}, #{password}, #{birthday}, #{id})")
//    public int insert(User2 user);
//}
public interface UserMapper {
    @Select("select * from user")
    public List<User2> find();

    @Insert("insert into user values  (#{username}, #{password}, #{birthday}, #{id})")
    public int insert(User2 user);

    @Delete("delete from user where id = #{id}")
    public int delete(int id);

    @Update("update user set username = #{username}, password = #{password}, birthday = #{birthday} where id = #{id}")
    public int update(User2 user);

}