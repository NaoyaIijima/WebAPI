package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class InputController{
    
    @GetMapping("/input")
    public String getInput(){
        return "input";
    }
    
    @PostMapping
    public String postRequest(@RequestParam("text1") String code, Model model){
        
        System.out.println(code);
        
        // 入力フォーマットの確認
//        if (code == null || code.equals("")) {
//            model.addAttribute("errorMessage", "郵便番号を入力してください。");
//            return zipcodeForm(session, model);
//        }

        
        
        return null;
        
    }
    
}
