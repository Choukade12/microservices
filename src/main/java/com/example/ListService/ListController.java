package com.example.ListService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class ListController {

    @GetMapping(value = "/weather")
    public List<String> allWeather(){
        return List.of(
                "rainy","winter","sunny","cloudy"
        );
    }
}
