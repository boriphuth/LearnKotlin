package com.example.demo_rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class Controller{

    @GetMapping("/{name}")
    fun getName():String{
        return "Name: Boriphuth"
    }
}