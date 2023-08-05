package com.tarkov.randomweapongenerator.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

// to fetch API
// API url required
@Component
public class FetchAPI {

    private String GraphQLurl="https://api.tarkov.dev/graphql";

    private WebClient webClient=WebClient.create();

    public void printSomething(){
        System.out.println("something");
    }


    @RequestMapping(value ="/tarkov", method =RequestMethod.GET )
    public String SelectDataByWeaponId(String id){
        String query="{\"query\":\"{ item( id :\\\""+id+"\\\"){ name id }}\"}";
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


