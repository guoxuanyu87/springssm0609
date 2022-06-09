package cn.com.controller;

import cn.com.entity.Account;
import cn.com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/9 15:10
 */
@Controller
public class AccountController {


    @Autowired
    private AccountService accountService;


    @RequestMapping(value = "/account",name = "查询全部账户")
    public String get(Map map){
        List<Account> list = accountService.findAll();
        map.put("list",list);

        return "account";

    }

}
