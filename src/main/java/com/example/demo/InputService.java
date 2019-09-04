package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InputService{
    
    @Autowired
    @Qualifier("zipCodeSearchRestTemplate")
    RestTemplate restTemplate;
    
    private static final String URL = "http://zipcloud.ibsnet.co.jp/api/search?zipcode={zipcode}";
    
    public ZipCodeDto service(String zipcode) {
        
        return restTemplate.getForObject(URL, ZipCodeDto.class, zipcode);
    }
}