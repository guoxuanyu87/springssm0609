package cn.com.service;

import cn.com.entity.Account;

import java.util.List;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/9 14:54
 */
public interface AccountService {
    List<Account> findAll();

    void changeAccount(String fromUser, String toUser, double money);

}
