package com.shopping.Ecart.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class Home {

    @GetMapping("/h")
    public ResponseEntity<?> getHome() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
