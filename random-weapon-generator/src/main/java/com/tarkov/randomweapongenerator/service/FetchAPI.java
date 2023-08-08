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

    // 무기 id 를 이용해 Graphql로 쿼리 전송 후 장착 가능 모드 리스트를 가져옴
    public String getModListByWeaponId(String id){
        String query="{\"query\":\"{ item(id:\\\""+id+"\\\"){ properties{...on ItemPropertiesWeapon{ slots{ nameId filters{ allowedItems{ id }}}}}}}\"}";
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


