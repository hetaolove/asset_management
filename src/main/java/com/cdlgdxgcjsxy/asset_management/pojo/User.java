package com.cdlgdxgcjsxy.asset_management.pojo;

import lombok.Data;

/**
 * 作者：何涛
 */

@Data
public class User {

    /**
     * 用户id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
