package com.example.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ListClient {

    private final RestTemplate restTemplate;

    public ListClient() {
        this.restTemplate = new RestTemplate();
    }

    public Set<String> getWeather(){
        String[] list = restTemplate.getForObject("http://localhost:9071/list/weather", String[].class);
        return Arrays.stream(list).collect(Collectors.toSet());
    }
}
