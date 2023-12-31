package com.example.thuctap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {
    @RequestMapping(value = "/product/list", method = RequestMethod.GET)
    public String list() {
        return "product/list";
    }

    @RequestMapping(value = "/product/detail/{id}", method = RequestMethod.GET)
    public String detailProductClient() {
        return "product/detail";
    }
}
