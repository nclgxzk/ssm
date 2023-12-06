package com.how2java.controller;

import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author 不会水的鸭子
 * @description TODO
 * @create 2023-12-05 20:05
 */

@Controller
@RequestMapping("/*")
public class CategoryController {

    @Autowired
    CategoryService categoryService = new CategoryServiceImpl();


    @RequestMapping("/listCategory")
    public ModelAndView listCategory(){
        ModelAndView modelAndView = new ModelAndView();

        List<Category> categoryList = categoryService.list();

        modelAndView.addObject("list",categoryList);
        modelAndView.setViewName("listCategory");
        return modelAndView;
    }

}
