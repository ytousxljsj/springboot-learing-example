package com.gj.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gj.mapper.UserDomainMapper;
import com.gj.model.UserDomain;
import com.gj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author dye
 * @Description TODO
 * @Date 2018/9/29
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDomainMapper userDomainMapper;

    @Override
    public int addUser(UserDomain user) {
        return userDomainMapper.insert(user);
    }

    /**
     * 这个方法用到了我们开始配置依赖的分页插件pagehelper，只需要在service层传入参数，然后将参数传递给一个插件 的一个静态方法就可以了
     *
     * @param pageNum  开始页数
     * @param pageSize 每页显示的数据条数
     * @return
     */
    @Override
    public PageInfo<UserDomain> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单
        PageHelper.startPage(pageNum, pageSize);
        List<UserDomain> userDomains = userDomainMapper.selectAllUser();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }
}
