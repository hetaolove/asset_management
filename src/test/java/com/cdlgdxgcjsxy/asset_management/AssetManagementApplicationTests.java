package com.cdlgdxgcjsxy.asset_management;

import com.cdlgdxgcjsxy.asset_management.mapper.UserDao.UserMapper;
import com.cdlgdxgcjsxy.asset_management.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AssetManagementApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void sayHello(){
        System.out.println("hello world!!!");
    }

    @Test
    void testSelectById(){
        User user = userMapper.selectById(1);
        System.out.println(user);
    }


}
