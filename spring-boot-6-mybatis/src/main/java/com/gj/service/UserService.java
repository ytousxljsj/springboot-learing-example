package com.gj.service;

import com.github.pagehelper.PageInfo;
import com.gj.model.UserDomain;

/**
 * @Author dye
 * @Description TODO
 * @Date 2018/9/29
 **/
public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
