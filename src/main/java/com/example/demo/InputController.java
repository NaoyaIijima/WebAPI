package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController{
    
    @Autowired
    InputService inputService;
    ZipCodeDto zipCodeDto;
    
    @GetMapping("/input")
    public String getInput(){
        return "input";
    }
    
    @PostMapping
    public String postRequest(@RequestParam("text1") String code, Model model){
        
        System.out.println(code);

        zipCodeDto = inputService.service(code);
        
        model.addAttribute("data", zipCodeDto.getResults());
        
        return "show";
        
    }
    
}
