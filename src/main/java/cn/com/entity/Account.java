package cn.com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/9 14:49
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    private int id;
    private String name;
    private double money;

}
