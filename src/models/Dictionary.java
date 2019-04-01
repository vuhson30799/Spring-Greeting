package models;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Dictionary {
    private Map<String,String> dictionary = new HashMap<>();

    public Dictionary(){
        dictionary.put("Hello","Xin Chao");
        dictionary.put("Teacher","Giao Vien");
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }
}
