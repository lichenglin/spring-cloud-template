package com.licl.spring.cloud.server.controller;


import com.licl.spring.cloud.client.UserClient;
import com.licl.spring.cloud.client.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "/usersadfasf", description = "Operations about user", produces = "application/json")
public class UserController implements UserClient {

    @ApiOperation(value = "第三方加入专辑", response = User.class, notes = "第三方加入专辑")
    public User getUser(@RequestBody User user) {
        User u = new User();
        u.setId(user.getId());
        u.setName("get " + user.getName() + " from server");
        System.out.println("****" + user);
        return u;
    }
}
