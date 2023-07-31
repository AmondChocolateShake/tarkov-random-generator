package com.tarkov.randomweapongenerator;

import com.tarkov.randomweapongenerator.entity.OptionBox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RandomWeaponGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomWeaponGeneratorApplication.class, args);
		System.out.println("hello");
		OptionBox optionBox=new OptionBox();
		
	}

}
