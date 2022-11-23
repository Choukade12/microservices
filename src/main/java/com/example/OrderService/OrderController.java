package com.example.OrderService;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    private final ListClient listClient;
    public OrderController(ListClient listClient){
        this.listClient = listClient;
    }
    @PostMapping(value = "/day")
    public Map<String,String> giveWeather(@RequestBody WeatherRequest request){
        Set<String> weathers = listClient.getWeather();
        if(weathers.contains(request.getName())) {
            return Map.of("status", "success", "Message", "today is " + request.getName());
        }
        else{
            return Map.of("status", "success");
        }
    }

    public class WeatherRequest{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
