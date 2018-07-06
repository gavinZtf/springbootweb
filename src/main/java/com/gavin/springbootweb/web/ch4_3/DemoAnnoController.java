package com.gavin.springbootweb.web.ch4_3;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gavin.springbootweb.domain.DemoObj;

/**
 * @author Gavin
 * @date 2018年7月4日
 */
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest req){
        return " url " + req.getRequestURI() + " can access ";
    }
    
    @RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest req){
        return " url " + req.getRequestURI() + " can access, str: " + str;
    }
    
    @RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(Long id, HttpServletRequest req){
        return " url " + req.getRequestURI() + " can access, id: " + id;
    }
    
    @RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj obj, HttpServletRequest req){
        return " url " + req.getRequestURI() + " can access, obj id: " + obj.getId() +
            "obj name :" + obj.getName();
    }
    
    @RequestMapping(value = {"/name1", "/name2"}, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String remove(HttpServletRequest req){
        return " url " + req.getRequestURI() + " can access";
    }
}
