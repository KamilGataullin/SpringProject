package com.springapp.mvc.aspects;

import com.springapp.mvc.common.MenuInfo;
import com.springapp.mvc.services.MenuService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Аспект для добавления списка категорий в меню шапки сайта
 *
 * Gataullin Kamil
 * 14.03.2016 23:24
 */
@Aspect
@Component
public class MainMenuAspect {

    private static final String MAIN_MENU_LIST = "listMenu";

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private MenuService menuService;

    @Pointcut("@annotation(com.springapp.mvc.aspects.annotation.IncludeMenuInfo)")
    public void includeMenuInfoMethod() {
    }

    @Before("includeMenuInfoMethod()")
    public void includeMenuInfo() {
        List<MenuInfo> listMenu = menuService.getMainMenu();
        request.setAttribute(MAIN_MENU_LIST, listMenu);
    }
}
