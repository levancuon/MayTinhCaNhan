package org.example.bt_maytinhcanhan.controller;

import org.example.bt_maytinhcanhan.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;
    @GetMapping("")
    public String home(){
        return "/home";
    }
    @PostMapping("/result")
    public String calculate(@RequestParam double a, @RequestParam double b, @RequestParam String c, Model model){
        if(c.equals("Addition")){
            model.addAttribute("result",calculatorService.addition(a,b));
        }else if(c.equals("Subtraction")){
            model.addAttribute("result",calculatorService.Subtraction(a,b));
        } else if (c.equals("Multiplication")) {
            model.addAttribute("result",calculatorService.Multiplication(a,b));
        } else if (c.equals("Division")) {
            model.addAttribute("result",calculatorService.Division(a,b));
        }
        else model.addAttribute("result","Nhập số đê");
        return "/home";
    }

}
