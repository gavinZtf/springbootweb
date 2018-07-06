package com.gavin.springbootweb.advice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gavin.springbootweb.domain.DemoObj;

/**
 * @author Gavin
 * @date 2018年7月6日
 */
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj){
        throw new IllegalArgumentException("非常抱歉，参数有误" + "来自@ModelAttribute" + 
            msg);
    }
}
