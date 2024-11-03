package com.example.cardapio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//aqui vai falar com a web e responder ela
@RequestMapping//aqui são os caminhos que vão ser usados para esse método

public class FoodController {

    @GetMapping
    public void getAll(){

    }
}
