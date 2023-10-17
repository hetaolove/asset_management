package com.cdlgdxgcjsxy.asset_management.mapper.UserDao;

import com.cdlgdxgcjsxy.asset_management.pojo.User;
import org.apache.ibatis.annotations.*;

/**
 * 作者:何涛
 */
@Mapper
public interface UserMapper {

    @Select("""
            select id,username,password from user
            where id = #{id}
            """)
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "password",property = "password")
    })
    /**
     * 通过id查找姓名
     */
    User selectById(Integer id);

    /**
     * 新增用户
     * @param user  用户json
     * @return 返回插入的条数
     */
    @Insert("""
            insert into user (username, password) values(#{username},#{password})
            """)
    Integer insertUser(User user);

    /**
     * 查询用户是否存在
     * @param user 用户json
     * @return 返回用户信息
     */
    @Select("""
            select username,password from user where username = #{username} and password = #{password}
            """)
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "password",property = "password")
    })
    User selectByUser(User user);
}
