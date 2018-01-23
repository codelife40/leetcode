package com.example.demo.controller;

import javax.validation.Valid;

import com.example.demo.domain.User;
import com.example.demo.service.UserServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by longmu on 14/01/2018.
 */

@Controller
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServie userService;

    @RequestMapping(method = RequestMethod.GET)
    public String getUserList(ModelMap map) {
        map.addAttribute("userList", userService.findAll());
        return "userList";
    }

    @RequestMapping(value = "/create" , method = RequestMethod.GET)
    public String addUser(ModelMap map) {
        map.addAttribute("user", new User());
        map.addAttribute("action","create");
        return "userForm";
    }

    @RequestMapping(value="/create",method = RequestMethod.POST)
    public String postUser(ModelMap map, @ModelAttribute @Valid User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            map.addAttribute("action","create");
            return "userForm";
        }

        userService.addUser(user);

        return "redirect:/users/";
    }
}
