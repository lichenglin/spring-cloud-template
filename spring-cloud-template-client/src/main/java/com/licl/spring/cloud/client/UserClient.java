package com.licl.spring.cloud.client;

import com.licl.spring.cloud.client.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("spring-cloud-template")
public interface UserClient {

    @RequestMapping("/getUser")
    User getUser(@RequestBody User user);

}
