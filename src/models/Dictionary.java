package models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Dictionary {
    @Autowired
    private Map<String,String> dictionary = new HashMap<>();

    public Dictionary(){
        dictionary.put("Hello","Xin Chao");
        dictionary.put("Teacher","Giao Vien");
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }
}
