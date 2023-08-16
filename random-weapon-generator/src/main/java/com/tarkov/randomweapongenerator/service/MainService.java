package com.tarkov.randomweapongenerator.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tarkov.randomweapongenerator.entity.Options;
import com.tarkov.randomweapongenerator.entity.WeaponData;
import com.tarkov.randomweapongenerator.repository.FetchAPI;

// 비즈니스 로직 시작 클래스
public class MainService {
    
    @Autowired
    FetchAPI fetchAPI;
    @Autowired
    RandomWeapon randomWeapon;
    @Autowired
    WeaponData weaponData;
    
    Options options;
    

    public MainService(Options options){
        this.options=options;
    }

    public void Main(){
        
        if(options.isRandom()){
            randomWeapon.GenerateRandomWeapon();
        }else{

        }

    }

}
