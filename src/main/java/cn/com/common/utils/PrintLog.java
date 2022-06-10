package cn.com.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/9 22:08
 */
@Component
@Aspect
@Slf4j
public class PrintLog {

    private static FileOutputStream fos = null;

    static {
        try {
            fos = new FileOutputStream(new File("D:\\new3.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Around("execution(* cn.com.controller.*.*(..))")
    public Object print2Local(ProceedingJoinPoint pjp) throws Throwable {
log.info("我是log.info出来的");
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        String methodName = method.getName();
        System.out.println("使用的方法是：" + methodName);
        createLog("使用的方法是：" + methodName);
        if (method.isAnnotationPresent(RequestMapping.class)) {
            RequestMapping requestMapping = method.getAnnotation(RequestMapping.class);
            String name = requestMapping.name();
            System.out.println("操作的名字是：" + name);
            createLog("操作的名字是：" + name);
        }

        return pjp.proceed();


    }

    public void createLog(String message) throws IOException {
        fos.write(message.getBytes());
        fos.write("\r\n".getBytes());
        System.out.println("日志输出完毕");
    }


}
