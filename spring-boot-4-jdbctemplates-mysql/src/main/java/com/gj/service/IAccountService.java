package com.gj.service;

import com.gj.domain.Account;

import java.util.List;

/**
 * @Author dye
 * @Description TODO
 * @Date 2018/9/28
 **/
public interface IAccountService {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
