package com.cdlgdxgcjsxy.asset_management.controller.usercontroller;

import com.cdlgdxgcjsxy.asset_management.pojo.User;
import com.cdlgdxgcjsxy.asset_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 何涛
 */

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/getUser")
    public String getUser(@RequestParam("username") String username,@RequestParam("password") String password){
        return "姓名:" + username + " ,密码: " + password;
    }

    @GetMapping("/user/getById")
    public User getById(@RequestParam(value = "id",required = true) Integer id){
        return userService.queryByUser(id);
    }
}
