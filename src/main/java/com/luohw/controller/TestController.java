package com.luohw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author luohw
 * @date 2020/3/5 20:23
 *
 * 测试类入口
 */

@RequestMapping("/test")
@RestController
public class TestController {

    @Value("${spring.cloud.client.ip-address}")
    private String ip;

//    @Value("${server.port}")
//    private String port;

    private String port="2100";

    @RequestMapping("/start")
    public String testStart(){
        System.out.println("-----------test start ------------------");
        return ip+":"+port+" Congratulations, your server start success !!!";
    }


}
