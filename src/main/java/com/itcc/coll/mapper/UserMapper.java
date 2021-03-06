package com.itcc.coll.mapper;

import com.itcc.coll.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from COLL_USER where username = #{username} and USERSTATUS='0'")
    User findByUsername(@Param("username")String username);



    @Select("select * from COLL_USER where id=#{userId} and USERSTATUS='0'")
    User findById(@Param("userId") int id);



    @Select("select * from COLL_USER where username = #{username} and password = #{pwd} and USERSTATUS='0'")
    User findByUsernameAndPwd(@Param("username")String username, @Param("pwd")String pwd);


}
