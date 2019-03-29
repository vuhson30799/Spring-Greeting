package controllers;

import models.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class GreetingController {
    @Autowired
    Dictionary dictionary;
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }
    @PostMapping("/convertResult")
    public String convert (@RequestParam(name = "money") float money,Model model){
//        float realMoney = Float.parseFloat(money);
        float result = money * 20000;
        model.addAttribute("money",money);
        model.addAttribute("result",result);
        return "convert";

    }
    @GetMapping("/convert")
    public String convertForm (){
        return "index";
    }

    @GetMapping("/translate")
    public String translateForm () {
        return "translateForm";
    }
    @PostMapping("/translateResult")
    public String translate (@RequestParam(name = "word")String word,Model model){
        String result = dictionary.getDictionary().get(word);
        if (result != null){
            model.addAttribute("result",result);
        }else {
            result = "Error";
            model.addAttribute("result",result);
        }
        return "translate";
    }
}
