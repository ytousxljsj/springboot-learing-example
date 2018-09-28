package com.gj.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author dye
 * @Description 人的属性
 * @Date 2018/9/28
 **/
@Component
@Data
public class PersionProperties {

    @Value("${demo.persion.name}")
    private String name;

    @Value("${demo.persion.age}")
    private int age;
}
