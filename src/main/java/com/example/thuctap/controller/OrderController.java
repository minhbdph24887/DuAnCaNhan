package com.example.thuctap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {
    @RequestMapping(value = "/order/checkout", method = RequestMethod.GET)
    public String viewOrder() {
        return "order/checkout";
    }

    @RequestMapping(value = "/order/list", method = RequestMethod.GET)
    public String list() {
        return "order/list";
    }

    @RequestMapping(value = "/order/detail/{id}", method = RequestMethod.GET)
    public String detail() {
        return "order/detail";
    }
}
