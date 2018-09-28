package com.gj.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author dye
 * @Description Persion实体类
 * @Date 2018/9/28
 **/
@Data
public class Persion implements Serializable {

    /**
     * 编号
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;
}
