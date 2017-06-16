package com.jinke.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by root on 17-6-16.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String defaultIndex() {
        return "index";
    }
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String Index() {
        return "index";
    }
    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {
        return "about";
    }
    @RequestMapping(value = "/post", method = RequestMethod.GET)
    public String post() {
        return "post";
    }
}
