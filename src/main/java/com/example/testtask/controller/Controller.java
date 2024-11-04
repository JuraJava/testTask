package com.example.testtask.controller;

import com.example.testtask.model.Users;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class Controller {

    @GetMapping
    public Users getUser() {
        return  new Users(1l, "Ivan", "Ivanov", "123@gmail.com", "aaa", "offline");
    }
}
