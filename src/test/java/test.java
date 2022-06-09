import cn.com.entity.Account;
import cn.com.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/9 15:06
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:springmvc.xml")

public class test {

    @Autowired
    private AccountService accountService;


    @Test
    public void test1(){
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account.toString());
        }

    }

    @Test
    public void test2(){
        accountService.changeAccount("tom","jack",100);
    }


}
