package com.codewithtejas.springcore.enterprise.controller;

import com.codewithtejas.springcore.enterprise.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// response formatting
@RestController
public class Controller {

    @Autowired
    private BusinessService bs;

    // /percent --> 100
    @GetMapping("/percent")
    public int displayPercent() {
        return bs.calculate();
    }
}