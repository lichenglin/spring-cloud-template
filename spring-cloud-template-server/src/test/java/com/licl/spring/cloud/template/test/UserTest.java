package com.licl.spring.cloud.template.test;


import com.licl.spring.cloud.client.model.User;
import com.licl.spring.cloud.server.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class UserTest {
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void getUser() throws Exception {
        User request = new User();
        request.setId(1l);
        request.setName("name");
        User rep = testRestTemplate.postForObject("/getUser", request, User.class);
        Assert.assertEquals(request.getId(), rep.getId());
        Assert.assertEquals(rep.getName(), "get name from server");
    }

}
