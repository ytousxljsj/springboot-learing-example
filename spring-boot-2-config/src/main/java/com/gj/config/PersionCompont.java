package com.gj.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * @Author dye
 * @Description TODO
 * @Date 2018/9/28
 **/
@Component
@ConfigurationProperties(prefix = "demo.persion")
@Validated
@Data
public class PersionCompont {

    @NotNull
    private String name;

    @NotNull
    private int age;

}
