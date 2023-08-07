package com.tarkov.randomweapongenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

// to fetch API
// API url required
@Component
public class FetchAPI {



    private String GraphQLurl;
    private WebClient webClient;

    @Autowired
    public FetchAPI(@Value("${graphql.endpoint}") String GraphQLurl){
        this.GraphQLurl=GraphQLurl;
        this.webClient=WebClient.create();
    }


    public String SelectDataByWeaponId(String id){
        String query="{\"query\":\"{ items{ name id }}\"}";
        System.out.println(query);
        String response=webClient.post()
            .uri(GraphQLurl)
            .header(HttpHeaders.CONTENT_TYPE,MediaType.APPLICATION_JSON_VALUE)
            .body(BodyInserters.fromValue(query))
            .retrieve()
            .bodyToMono(String.class)
            .block();
            
        return response;
    }



}


