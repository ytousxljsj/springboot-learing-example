package com.gj.mapper;

import com.gj.model.UserDomain;

import java.util.List;

public interface UserDomainMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserDomain record);

    List<UserDomain> selectAllUser();

    int insertSelective(UserDomain record);

    UserDomain selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserDomain record);

    int updateByPrimaryKey(UserDomain record);
}