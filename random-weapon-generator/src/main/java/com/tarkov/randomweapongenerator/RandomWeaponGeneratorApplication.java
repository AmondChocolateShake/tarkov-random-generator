package com.tarkov.randomweapongenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.tarkov.randomweapongenerator.service.FetchAPI;

@SpringBootApplication
public class RandomWeaponGeneratorApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(RandomWeaponGeneratorApplication.class, args);
		
	}

}
