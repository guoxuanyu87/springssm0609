package cn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/10 16:35
 */

@Controller
public class LoginController {


    @RequestMapping(value = "/login",name = "进行登录")
    public String login(String username,String password){
        if (username.isEmpty() || password.isEmpty()){
            return "forward:/index.jsp";
        }
        System.out.println("登录所使用的用户名："+username+" , 密码是 ："+password);

        return "forward:/viplist.jsp";

    }


}
