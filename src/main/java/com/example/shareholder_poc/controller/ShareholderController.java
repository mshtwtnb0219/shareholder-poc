package com.example.shareholder_poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShareholderController {

    @GetMapping("/api/shareholders")
    public  String getShareholders() {
        return "Shareholder API OK";
    }
}
