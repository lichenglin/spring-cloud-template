package com.licl.spring.cloud.client.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "user对象", description = "用户对象user")
public class User {

    @ApiModelProperty(value = "用户ID", name = "id", example = "1")
    private Long id;

    @ApiModelProperty(value = "用户名称", name = "name", example = "licl")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
