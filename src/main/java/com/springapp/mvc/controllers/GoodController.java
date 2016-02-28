package com.springapp.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Контроллер для работы с карточкой товара
 *
 * Gataullin Kamil
 * 28.02.2016 21:04
 */
@Controller
@RequestMapping(value = "/good", method = RequestMethod.GET)
public class GoodController {

    @Autowired
    private HttpServletRequest request;

    /**
     * Отображение карточки товара
     *
     * @param goodId id товара
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String renderGoodPage(@PathVariable("id") Long goodId) {
        request.setAttribute("goodId", goodId);
        return "good/goodPage";
    }
}
