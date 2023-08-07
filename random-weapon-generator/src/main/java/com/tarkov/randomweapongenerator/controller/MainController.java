package com.tarkov.randomweapongenerator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tarkov.randomweapongenerator.entity.OptionBox;

//클라이언트 요청 처리 클래스
@RestController
public class MainController {

    @PostMapping("/generate")
    public ResponseEntity<String[]> CollectOptions(@RequestBody OptionBox option){



        
    }

}
