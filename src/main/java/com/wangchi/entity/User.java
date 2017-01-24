package com.wangchi.entity;

/**
 * Created by Jackie on 2017/1/23.
 */
public class User {
    private Integer id;
    private String name;
    private String Gender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
