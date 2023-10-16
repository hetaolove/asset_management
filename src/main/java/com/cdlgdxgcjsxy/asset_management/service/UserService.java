package com.cdlgdxgcjsxy.asset_management.service;


import com.cdlgdxgcjsxy.asset_management.pojo.User;
import org.springframework.stereotype.Service;


/**
 * 何涛
 */
@Service
public interface UserService {
    User queryByUser(Integer id);
}
