package com.example.thuctap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShoppingCartController {
    @RequestMapping(value = "/cart/view", method = RequestMethod.GET)
    public String viewCart() {
        return "cart/view";
    }
}
