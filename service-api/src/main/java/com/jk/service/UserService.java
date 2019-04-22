package com.jk.service;

import com.jk.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {

    @RequestMapping(value = "/queryUserName" ,method = RequestMethod.GET)
    public String queryUserName(@RequestParam("name") String name );


    @RequestMapping(value = "/queryUser",method = RequestMethod.POST)
    public User queryUser(@RequestBody User user);
}
