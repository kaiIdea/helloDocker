package com.example.hellodocker.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Auther: GEEX1428
 * @Date: 2021/10/21 18:20
 * @Description:
 */
@Slf4j
@Controller
@RequestMapping(value = "/end")
public class EndController {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssSSS");

    @ResponseBody
    @RequestMapping(path = "/perfect",method = RequestMethod.GET)
    public String getHi(){
        log.info("controller-docker:"+LocalDateTime.now().format(formatter));
        return "终于好啦...";
    }
}

