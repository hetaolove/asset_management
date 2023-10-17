package com.cdlgdxgcjsxy.asset_management.controller.usercontroller;

import com.cdlgdxgcjsxy.asset_management.pojo.User;
import com.cdlgdxgcjsxy.asset_management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 何涛
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(@RequestParam("username") String username,@RequestParam("password") String password){
        return "姓名:" + username + " ,密码: " + password;
    }

    @GetMapping("/getById")
    public User getById(@RequestParam(value = "id",required = true) Integer id){
        return userService.queryByUser(id);
    }

    @PostMapping("/insertUser")
    public Integer insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }

    @PostMapping("/query")
    public User getByUser(@RequestBody User user){
        if (userService.queryUser(user) != null){
            return userService.queryUser(user);
        }else {
            return null;
        }
    }
}
