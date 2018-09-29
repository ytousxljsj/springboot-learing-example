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

    //@Transactional 声明事务 只需要加一行注解就可以了，前提你用的是jdbctemplate, jpa, mybatis，这种常见的orm。
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
