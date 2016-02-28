package com.springapp.mvc.controllers;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.common.MenuInfo;
import com.springapp.mvc.common.catalog.CatalogFilterInfo;
import com.springapp.mvc.services.CatalogService;
import com.springapp.mvc.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Контроллер отвечающий за каталог
 *
 * Gataullin Kamil
 * 22.02.2016 22:46
 */
@Controller
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private CatalogService catalogService;

    /**
     * Отображение каталога
     *
     * @param id    id категории
     * @param page  номер страницы
     * @param limit кол-во товаров отображаемых на странице
     * @return отображение каталога
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String renderCatalog(@PathVariable("id") Long id,
                                @RequestParam(value = "page", required = false, defaultValue = "1") String page,
                                Long limit,
                                Model model) {
        // TODO вынести в аспект
        List<MenuInfo> listMenu = menuService.getMainMenu();
        model.addAttribute("listMenu", listMenu);

        List<GoodInfo> goods = catalogService.getGoodsByCategoryId(id);
        model.addAttribute("goods", goods);

        CatalogFilterInfo catalogFilter = catalogService.getCatalogFilters(id);
        model.addAttribute("catalogFilter", catalogFilter);

        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        return "catalog/catalogPage";
    }

    /**
     * Отображение главной страницы каталога
     */
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String mainCatalog(HttpServletRequest request) {
        request.setAttribute("message", "Главная страница каталога");
        return "catalog/catalogPage";
    }
}
