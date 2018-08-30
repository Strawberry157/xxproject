package com.onlymark.xxweb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/getName")
    public String getName(){
        return "Hello World";
    }
}
