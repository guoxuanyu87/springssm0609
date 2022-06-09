package cn.com.common.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>Title:<p>
 *
 * @author xiaoxiaohou
 * @date in 2022/6/9 15:33
 */

@ControllerAdvice
public class ErrorAdvice {

    @ExceptionHandler(RuntimeException.class)
    public ModelAndView handerrir(RuntimeException ex){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",ex.getMessage());

        mv.setViewName("error500");
        return mv;


    }

}
