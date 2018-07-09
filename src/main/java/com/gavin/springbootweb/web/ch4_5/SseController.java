package com.gavin.springbootweb.web.ch4_5;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Gavin
 * @date 2018年7月9日
 */
@Controller
public class SseController {

    @RequestMapping(value = "/push", produces = {"text/event-stream"})
    public @ResponseBody String push(){
        Random random = new Random();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
             e.printStackTrace();
        }
        return "data:testing 1,2,3" + random.nextInt() + "\n\n";
    }
}
