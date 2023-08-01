package com.tarkov.randomweapongenerator.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

// to fetch API
// API url required
@Service
public class FetchAPI {

    private String GraphQLurl="https://api.tarkov.dev/graphql";
    private WebClient webClient=WebClient.create();



    public void SelectDataByWeaponId(String id){
        String query="{\"query\":\"{ item( id :\\\""+id+"\\\"){ name id }}\"}";
        System.out.println(query);
        String response=webClient.post()
            .uri(GraphQLurl)
            .header(HttpHeaders.CONTENT_TYPE,MediaType.APPLICATION_JSON_VALUE)
            .body(BodyInserters.fromValue(query))
            .retrieve()
            .bodyToMono(String.class)
            .block();
        
        System.out.println(response);
    }

}


