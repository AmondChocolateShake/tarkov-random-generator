package com.tarkov.randomweapongenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class RandomWeaponGeneratorApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(RandomWeaponGeneratorApplication.class, args);
		
	}

	@Override
	public void run(String...args){

	}
	
}
