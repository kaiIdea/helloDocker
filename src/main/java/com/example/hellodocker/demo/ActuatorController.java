package com.example.hellodocker.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Auther: GEEX1428
 * @Date: 2021/11/9 11:11
 * @Description: 执行就绪，存活健康检查
 */
@Slf4j
@Controller
@RequestMapping(value = "/actuator")
public class ActuatorController {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @ResponseBody
    @RequestMapping(path = "/healthReady",method = RequestMethod.GET)
    public String healthReady(HttpServletRequest request){
        log.info("actuator-healthReady:"+ LocalDateTime.now().format(formatter)+",host:"+request.getRemoteHost()+",port:"+request.getRemotePort());
        return "已就绪...";
    }


    @ResponseBody
    @RequestMapping(path = "/healthLive",method = RequestMethod.GET)
    public String healthLive(HttpServletRequest request){
        log.info("actuator-healthLive:"+ LocalDateTime.now().format(formatter)+",host:"+request.getRemoteHost()+",port:"+request.getRemotePort());
        return "已存活...";
    }
}
