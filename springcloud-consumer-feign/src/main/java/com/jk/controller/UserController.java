package com.jk.controller;

import com.jk.model.User;
import com.jk.service.UserServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: $
 * @Author: xzh
 * @Date: 2019/4/22 16:21
 */
@RestController
public class UserController {


    @Autowired
    private UserServiceApi userServiceApi;


    //@RequestParam  要加参数名称
    @RequestMapping(value = "hi")
    public String queryUserName(@RequestParam("name") String name){

        return userServiceApi.queryUserName(name);
    }


    @RequestMapping(value = "hello")
    public User queryUser(){
        User user =new User();
        user.setUserName("wang");
        user.setUserAge(20);
        return userServiceApi.queryUser(user);
    }

}
