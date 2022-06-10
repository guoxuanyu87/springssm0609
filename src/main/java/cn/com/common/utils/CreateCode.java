package cn.com.common.utils;

import org.springframework.stereotype.Component;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/9 22:05
 */
@Component
public class CreateCode {

    public static String getCode(){

        // 生成一个由大写字母和数字组成的6位随机字符串，并且字符串不重复
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','M','N','P','Q','R','S','T','U','V','W','X','Y','Z',
                '1','2','3','4','5','6','7','8','9'};
        boolean[] flags = new boolean[letters.length];
        char[] cha = new char[6];
        for (int i = 0; i < cha.length; i++) {
            int index;
            do {
                index = (int) (Math.random()*(letters.length));
            }while (flags[index]);//判断生成的字符串是否重复
            cha[i] = letters[index];
            flags[index] = true;
        }

        return new String(cha);

    }

}
