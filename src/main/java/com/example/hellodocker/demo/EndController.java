package com.example.hellodocker.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/21 18:20
 * @Description:
 */
@Controller
@RequestMapping(value = "/end")
public class EndController {

    @ResponseBody
    @RequestMapping(path = "/perfect",method = RequestMethod.GET)
    public String getHi(){
        System.out.println();
        return "终于好啦...";
    }
}
