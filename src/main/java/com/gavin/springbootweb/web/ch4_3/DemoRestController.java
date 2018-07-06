package com.gavin.springbootweb.web.ch4_3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gavin.springbootweb.domain.DemoObj;

/**
 * @author Gavin
 * @date 2018年7月4日
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getJson", produces = {"application/json;charset=UTF-8"})
    public DemoObj getJson(DemoObj obj){
        return new DemoObj(obj.getId() + 1, obj.getName() + "yy");
    }
    
    @RequestMapping(value = "/getXml", produces = {"application/xml;charset=UTF-8"})
    public DemoObj getXml(DemoObj obj){
        return new DemoObj(obj.getId() + 1, obj.getName() + "yy");
    }
}
