package com.springapp.mvc.controllers;

import com.springapp.mvc.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Контроллер для работы с корзиной
 *
 * Gataullin Kamil
 * 02.03.2016 0:17
 */
@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private CartService cartService;

    /**
     * Отображение содержимого корзины
     */
    @RequestMapping
    public String renderCart() {
        return "cart/cartPage";
    }

    /**
     * Добавление товара в корзину
     *
     * @param goodId id товара
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addInCart(Long goodId) {
        cartService.addInCart(request.getSession(), goodId, 1);
        return "ok";
    }
}
