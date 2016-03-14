package com.springapp.mvc.controllers;

import com.springapp.mvc.aspects.annotation.IncludeMenuInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Контроллер для обработки обращений клиентов
 *
 * Gataullin Kamil
 * 12.03.2016 23:11
 */
@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    /**
     * Отображение страницы с формой "Обратная связь"
     */
    @IncludeMenuInfo
    @RequestMapping(method = RequestMethod.GET)
    public String renderFeedbackPage() {
        return "feedback/feedbackPage";
    }
}
