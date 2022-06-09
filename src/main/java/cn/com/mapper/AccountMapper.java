package cn.com.mapper;

import cn.com.entity.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/9 14:50
 */
public interface AccountMapper {

    List<Account> findAll();

    void decr(@Param("fromUser") String fromUser,@Param("money") double money);

    void incr(@Param("toUser") String toUser,@Param("money") double money);

}
