package com.gj.controller;

import com.gj.config.PersionCompont;
import com.gj.config.PersionProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dye
 * @Description Spring Boot 2.0  读取config配置文件案例
 * @Date 2018/9/28
 **/
@RestController
public class PersionController {

    @Autowired
    PersionProperties PersionProperties;

    @Autowired
    PersionCompont PersionCompont;

    //    @GetMapping("/persion")   ==  @RequestMapping(value = "/persion",method = RequestMethod.GET)
    @RequestMapping(value = "/persion", method = RequestMethod.GET)
    public String persion() {
        return "Hello, " + PersionProperties.getName() + " 年龄是 " + PersionProperties.getAge();
    }

    @GetMapping("/persion/compont")
    public String perisonCompont() {
        return "" + PersionCompont.getName() + ": " + PersionCompont.getAge();
    }
}
