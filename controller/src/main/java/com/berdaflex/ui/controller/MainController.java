package com.berdaflex.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alexander_borohov on 26.9.16.
 */
@Controller
public class MainController {


    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
