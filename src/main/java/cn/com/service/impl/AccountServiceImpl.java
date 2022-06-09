package cn.com.service.impl;

import cn.com.entity.Account;
import cn.com.mapper.AccountMapper;
import cn.com.service.AccountService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/9 14:55
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }

    @Override
    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,timeout = -1)
    public void changeAccount(String fromUser, String toUser, double money) {
        accountMapper.decr(fromUser,money);
        int i = 1/0;
        accountMapper.incr(toUser,money);

    }

    @Override
    public PageInfo<Account> findByPage(int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex,pageSize);
        List<Account> list = this.findAll();

        return new PageInfo<Account>(list,6);
    }
}
