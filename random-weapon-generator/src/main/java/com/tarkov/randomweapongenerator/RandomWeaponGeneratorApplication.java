package com.tarkov.randomweapongenerator;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.tarkov.randomweapongenerator.service.FetchAPI;

@SpringBootApplication
@ComponentScan(basePackages = "service")
public class RandomWeaponGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomWeaponGeneratorApplication.class, args);
		System.out.println("hello");
		FetchAPI api=new FetchAPI();
		api.SelectDataByWeaponId("5447a9cd4bdc2dbd208b4567");
	}

}
