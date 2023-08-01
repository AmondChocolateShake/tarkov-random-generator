package com.tarkov.randomweapongenerator.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

// to fetch API
// API url required
@Service
public class FetchAPI {

    @Value("${graphql.endpoint}")
    private String GraphQLurl;
    private WebClient webClient=WebClient.create();



    protected Object SelectDataByWeaponId(String id){
        
        "query {
            items(categoryNames:Weapon){
              name
              categories{
                name
              }
            }
          }"
    }

}


