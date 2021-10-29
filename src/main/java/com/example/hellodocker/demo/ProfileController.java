package com.example.hellodocker.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/29 13:10
 * @Description:
 */
@Controller
@RequestMapping(value = "/profile")
public class ProfileController {


    @Value("${test.value}")
    private String testValue;


    @Value("${file.url}")
    private String fileUrl;

    @ResponseBody
    @RequestMapping(path = "/show",method = RequestMethod.GET)
    public String show(){
        return testValue;
    }


    @ResponseBody
    @RequestMapping(path = "/fileUrl",method = RequestMethod.GET)
    public String fileUrl(){
        return fileUrl;
    }
}