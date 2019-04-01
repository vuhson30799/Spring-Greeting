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
    @GetMapping("/spring_not_maven/greeting")
    public String greeting(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }

    @PostMapping("/spring_not_maven/convertResult")
    public String convert (@RequestParam(name = "money") float money,Model model){
        float result = money * 20000;
        model.addAttribute("money", money);
        model.addAttribute("result", result);
        return "convert";
    }
    @GetMapping("/spring_not_maven/convert")
    public String convertForm (){
        return "convertForm";
    }
    @GetMapping("/spring_not_maven/translate")
    public String translateForm () {
        return "translateForm";
    }

    @PostMapping("/spring_not_maven/translateResult")
    public String translate (@RequestParam(name = "word")String word,Model model){
        String result = dictionary.getDictionary().get(word);
        if (result != null){
            result += "(not create by Maven)";
            model.addAttribute("result",result);
        }else {
            result = "Error This word is not exist!! (not create by Maven)";
            model.addAttribute("result",result);
        }
        return "translate";
    }
}
