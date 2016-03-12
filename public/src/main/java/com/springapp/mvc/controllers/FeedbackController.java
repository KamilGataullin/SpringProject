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
 * 12.03.2016 23:11
 */
@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private MenuService menuService;

    @RequestMapping(method = RequestMethod.GET)
    public String renderFeedbackPage() {
        // TODO вынести в аспект
        List<MenuInfo> listMenu = menuService.getMainMenu();
        request.setAttribute("listMenu", listMenu);

        return "feedback/feedbackPage";
    }
}
