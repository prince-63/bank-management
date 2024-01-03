package com.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("Notice")
    public String getNotice() {
        return "myNotice";
    }
}
