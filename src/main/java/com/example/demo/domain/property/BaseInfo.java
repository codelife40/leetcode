package com.example.demo.domain.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by longmu on 14/01/2018.
 */

@Component
@ConfigurationProperties(prefix = "baseinfo")
public class BaseInfo {

    private String userName;
    private String Address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


    @Override
    public String toString() {
        return "UserName = " + this.getUserName() + ",Address="+ this.getAddress();
    }
}
