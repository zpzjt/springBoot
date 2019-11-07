package com.zpzjt.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello.do")
    @ResponseBody
    public String hello(){
        return "s121321ssssss232421ss2121sss";
    }
}
