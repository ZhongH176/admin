package com.jk.model;

import java.io.Serializable;

/**
 * @Description: $
 * @Author: xzh
 * @Date: 2019/4/22 16:29
 */
public class User implements Serializable {


    private static final long serialVersionUID = -6670640310551713010L;

    private String userName;

    private Integer userAge;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
