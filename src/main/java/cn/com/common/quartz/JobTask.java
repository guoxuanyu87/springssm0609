package cn.com.common.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/9 18:18
 */

public class JobTask {

    public void printTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sdfTime = sdf.format(new Date());
        System.out.println("现在的时间是："+sdfTime);

    }

}
