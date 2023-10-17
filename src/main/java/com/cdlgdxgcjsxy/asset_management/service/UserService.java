package com.cdlgdxgcjsxy.asset_management.service;


import com.cdlgdxgcjsxy.asset_management.pojo.User;
import org.springframework.stereotype.Service;


/**
 * 何涛
 */
@Service
public interface UserService {

    /**
     * 查询用户通过id
     * @param id 用户id
     * @return 查询的用户
     */
    User queryByUser(Integer id);

    /**
     * 新增用户信息
     * @param user 新增用户
     * @return 插入的条数
     */
    Integer insertUser(User user);

    /**
     *  查询用户是否存在
     * @param user
     * @return
     */
    User queryUser(User user);
}
