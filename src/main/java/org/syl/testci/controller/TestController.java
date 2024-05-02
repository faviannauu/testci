package org.syl.testci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class TestController {

    @GetMapping("/")
    public String boxItem() {
        return "Hello Admin!";
    }
}
