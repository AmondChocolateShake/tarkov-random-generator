package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tarkov.randomweapongenerator.service.FetchAPI;

@Component
public class RandomWeaponGeneratorRun implements CommandLineRunner{
    
    @Autowired
    private FetchAPI api;

    @Override
    public void run(String... args){
        api.SelectDataByWeaponId("");
    }
}
