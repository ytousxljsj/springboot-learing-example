package com.gj.controller;

import com.gj.service.UserService;
import com.gj.model.UserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author dye
 * @Description TODO
 * @Date 2018/9/29
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/add")
    public int addUser(UserDomain user) {
        return userService.addUser(user);
    }

    @GetMapping(value = "/all")
    public Object findAllUser(@RequestParam(name = "pageName", required = false, defaultValue = "1") int pageName,
                              @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        return userService.findAllUser(pageName, pageSize);
    }

}
