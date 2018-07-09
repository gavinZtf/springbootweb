package com.gavin.springbootweb.web.ch4_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import com.gavin.springbootweb.service.PushService;

/**
 * @author Gavin
 * @date 2018年7月9日
 */
@Controller
public class AsyncController {

    @Autowired
    PushService pushService;
    
    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall(){
        return pushService.getAsyncUpdate();
    }
}
