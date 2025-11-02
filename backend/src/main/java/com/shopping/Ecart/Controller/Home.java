package com.shopping.Ecart.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class Home {
    public String home() {
        return "hello";
    }
}
