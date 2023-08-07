package com.tarkov.randomweapongenerator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//클라이언트 요청 처리 클래스
@RestController
public class MainController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }



}
