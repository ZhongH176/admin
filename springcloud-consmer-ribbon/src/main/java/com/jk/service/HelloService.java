package com.jk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: $
 * @Author: xzh
 * @Date: 2019/4/22 16:15
 */
public class HelloService {

    @Autowired
    RestTemplate restTemplate;


    //第一个url 参数代表访问服务的路径    第二个参数代表传递的参数类型
    //第一个参数中url如果大写调用不通报错请改成小写
    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }


}
