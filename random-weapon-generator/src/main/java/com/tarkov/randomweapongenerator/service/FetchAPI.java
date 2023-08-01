package com.tarkov.randomweapongenerator.service;

import org.springframework.web.reactive.function.client.WebClient;

// to fetch API
// API url required
public class FetchAPI {
    String APIurl;
    WebClient webClient;

    public FetchAPI(String url){
        APIurl=url;
        webClient=WebClient.create(APIurl);
    }

    

}


