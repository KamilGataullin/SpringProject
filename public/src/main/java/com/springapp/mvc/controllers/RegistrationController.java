package com.springapp.mvc.controllers;

import com.springapp.mvc.common.MenuInfo;
import com.springapp.mvc.form.RegistrationFormBean;
import com.springapp.mvc.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
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

        request.setAttribute("regForm", new RegistrationFormBean());
        return "registration/registrationPage";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String registrationForm(
            @Valid @ModelAttribute("regForm") RegistrationFormBean registrationFormBean,
//            RegistrationFormBean registrationFormBean, // TODO хотя работает и без этой аннотации, обычно её используют для переименования аргумента
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // TODO вынести в аспект
            List<MenuInfo> listMenu = menuService.getMainMenu();
            request.setAttribute("listMenu", listMenu);
            return "registration/registrationPage";
        }
        // здесь должна происходить регистрация пользователя
        System.out.println(registrationFormBean);
        return "registration/result";
    }
}
