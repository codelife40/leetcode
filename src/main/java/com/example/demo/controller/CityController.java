package com.example.demo.controller;

import com.example.demo.domain.City;
import com.example.demo.domain.User;
import com.example.demo.domain.property.BaseInfo;
import com.example.demo.service.CityService;
import com.example.demo.service.UserServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by longmu on 13/01/2018.
 */

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private UserServie userService;

    @Autowired
    private BaseInfo baseInfo;

    @RequestMapping(value="/api/city",method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value="cityName",required = true) String cityName) {
        return cityService.findByName(cityName);
    }

    @RequestMapping(value="/api/user",method = RequestMethod.GET)
    public User findUser(@RequestParam(value = "name",required = true) String name) {
        return userService.findByName(name);
    }

    @RequestMapping(value="/api/baseinfo",method = RequestMethod.GET)
    public String getBaseInfo() {
        return baseInfo.toString();
    }

    @RequestMapping(value="/api/user/{id}",method=RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return userService.findById(id);
    }
}
