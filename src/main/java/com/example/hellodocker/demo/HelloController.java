package com.example.hellodocker.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/18 17:08
 * @Description:
 */
@Controller
@RequestMapping(value = "/controller")
public class HelloController {

    @ResponseBody
    @RequestMapping(path = "/docker",method = RequestMethod.GET)
    public String getHi(){
        System.out.println("11111");
        return "Hello World...";
    }


    @ResponseBody
    @RequestMapping(path = "/good",method = RequestMethod.GET)
    public String good(){
        System.out.println("111111111111");
        return "a good day from nowing...";
    }
}
