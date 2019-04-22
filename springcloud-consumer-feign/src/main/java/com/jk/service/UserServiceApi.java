package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Description: $
 * @Author: xzh
 * @Date: 2019/4/22 16:22
 */
@FeignClient(value = "servicehi")
public interface UserServiceApi extends UserService{
}
