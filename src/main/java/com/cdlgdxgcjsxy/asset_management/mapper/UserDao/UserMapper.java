package com.cdlgdxgcjsxy.asset_management.mapper.UserDao;

import com.cdlgdxgcjsxy.asset_management.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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
}
