package com.example.demo.config.controller;

import com.example.demo.config.model.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class RecipeController {

    @GetMapping("/ingredients")
    public ResponseEntity<List<Item>> getItems() {
        return new ResponseEntity(Arrays.asList("a", "b", "c"), HttpStatus.OK);
    }
}
