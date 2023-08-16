package com.tarkov.randomweapongenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tarkov.randomweapongenerator.entity.Options;


//클라이언트 요청 처리 클래스
@RestController
public class MainController {

    @PostMapping("/generate")
    public ResponseEntity<String> CollectOptions(@RequestBody Options options){
        
        String ok="ok";

        

        ResponseEntity<String> responseEntity = ResponseEntity.ok(ok);
        
        return responseEntity;

    }

}


class WeaponOptions {
    
    private boolean gun_works;
    private boolean no_scope;
    private boolean no_stock;
    private boolean no_magazine;
    private boolean no_handguard;
    private boolean no_foregrip;
    private boolean no_pistolgrip;
    private boolean no_bullet;
    private boolean random_weapon;

    public WeaponOptions(boolean gun_works, boolean no_scope, boolean no_stock,
                         boolean no_magazine, boolean no_handguard, boolean no_foregrip,
                         boolean no_pistolgrip, boolean no_bullet, boolean random_weapon) {
        this.gun_works = gun_works;
        this.no_scope = no_scope;
        this.no_stock = no_stock;
        this.no_magazine = no_magazine;
        this.no_handguard = no_handguard;
        this.no_foregrip = no_foregrip;
        this.no_pistolgrip = no_pistolgrip;
        this.no_bullet = no_bullet;
        this.random_weapon = random_weapon;
    }
    // 생성자, 게터, 세터 등을 포함하여 필요한 메서드 작성
}