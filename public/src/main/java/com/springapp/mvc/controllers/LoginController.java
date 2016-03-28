package com.springapp.mvc.controllers;

import com.springapp.mvc.aspects.annotation.IncludeMenuInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Gataullin Kamil
 * 27.03.2016 22:24
 */
@Controller
public class LoginController {

    @IncludeMenuInfo
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String renderLoginPage() {
        return "login/login";
    }
}
