package com.gt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/3/22.
 */
@Controller
public class BookController {

    @RequestMapping("/book_list")
    public String listBooks(Model model){
        return "BookList";
    }
}
