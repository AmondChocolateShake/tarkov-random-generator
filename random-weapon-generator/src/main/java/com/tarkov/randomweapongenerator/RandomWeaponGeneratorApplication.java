package com.tarkov.randomweapongenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tarkov.randomweapongenerator.repository.FetchAPI;

@SpringBootApplication
public class RandomWeaponGeneratorApplication implements CommandLineRunner {
	
	private FetchAPI fetchAPI;

	@Autowired
	public RandomWeaponGeneratorApplication(FetchAPI api){
		this.fetchAPI=api;
	}

	public static void main(String[] args) {
		SpringApplication.run(RandomWeaponGeneratorApplication.class, args);
		
	}

	@Override
	public void run(String...args){
		System.out.println(fetchAPI.getModListByWeaponId("5447a9cd4bdc2dbd208b4567"));
	}
	
}
