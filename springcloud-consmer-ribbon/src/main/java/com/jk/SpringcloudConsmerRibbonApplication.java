package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudConsmerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsmerRibbonApplication.class, args);
    }

    /**
     * <bean id="restTemplate" class="org.springframework.web.client.RestTemplate"></bean>
     *@LoadBalanced注解表明这个restRemplate开启负载均衡的功能
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

