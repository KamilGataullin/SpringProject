package com.springapp.mvc.controllers;

import com.springapp.mvc.common.MenuInfo;
import com.springapp.mvc.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Gataullin Kamil
 * 12.03.2016 22:53
 */
@Controller
@RequestMapping("/reg")
public class RegistrationController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private MenuService menuService;

    @RequestMapping(method = RequestMethod.GET)
    public String renderRegistrationPage() {
        // TODO вынести в аспект
        List<MenuInfo> listMenu = menuService.getMainMenu();
        request.setAttribute("listMenu", listMenu);
        return "registration/registrationPage";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String registrationForm() {
        return "registration/registrationPage";
    }
}
