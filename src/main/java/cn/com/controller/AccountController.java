package cn.com.controller;

import cn.com.entity.Account;
import cn.com.service.AccountService;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value = "/accountlist",name = "分页查询账户")
    public String getlist(Map map){
        int pageIndex = 1;
        int pageSize= 2;
        PageInfo<Account> pageInfo = accountService.findByPage(pageIndex,pageSize);
        map.put("page",pageInfo);
        return "accountlist";

    }

    @RequestMapping(value = "/sendCode",name = "发送验证码")
    @ResponseBody
    public String sendCode(@RequestBody String username){

        JSONObject jsonObject = JSONObject.parseObject(username);
        String phoneNum = (String) jsonObject.get("phoneNum");

        return "success";

    }

}
