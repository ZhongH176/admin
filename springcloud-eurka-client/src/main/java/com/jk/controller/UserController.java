package com.jk.controller;

import com.jk.model.User;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: $
 * @Author: xzh
 * @Date: 2019/4/22 16:05
 */
@RestController
public class UserController {

    @GetMapping("/queryUserName")
    public String queryUserName(@RequestParam("name") String name){

        System.out.println(name);

        return  "hello "+name;
    }

    @RequestMapping("/queryUser")

    public User queryUser(@RequestBody User user){

        System.out.println(user);
        User user1 =new User();
        user1.setUserAge(18);
        user1.setUserName("li");
        return  user1;
    }



}
