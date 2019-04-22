package com.jk.controller;

import com.jk.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: $
 * @Author: xzh
 * @Date: 2019/4/22 16:14
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    // @RequestMapping(value = "/hi",method = RequestMethod.GET)   restful编程风格
    //@RequestParam  传递基本变量
    // @RequestBody   服务之间传递对象
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }

}
