package cn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/10 17:31
 */

@Controller
public class VIPController {



    @RequestMapping(value = "/vip1/{id}",name = "进入到vip1页面")
    public String getvip1(@PathVariable("id") String id){

        return "/vip1/vip1_"+id;
    }

    @RequestMapping(value = "/vip2/{id}",name = "进入到vip2页面")
    public String getvip2(@PathVariable("id") String id){

        return "/vip2/vip2_"+id;
    }

    @RequestMapping(value = "/vip3/{id}",name = "进入到vip3页面")
    public String getvip3(@PathVariable("id") String id){

        return "/vip3/vip3_"+id;
    }

}
