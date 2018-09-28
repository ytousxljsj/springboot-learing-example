package com.gj.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Entity 表明是一个映射的实体类， @Id表明id， @GeneratedValue 字段自动生成
 * @Author dye
 * @Description TODO
 * @Date 2018/9/28
 **/
@Entity
@Data
public class Account {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double money;
}
