package com.oil.ecommerceoilapp.controller;

import com.oil.ecommerceoilapp.dto.CategoryDTO;
import com.oil.ecommerceoilapp.entity.Category;
import com.oil.ecommerceoilapp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "/save")
    public void savecategory(CategoryDTO categoryDTO){
        categoryService.saveCategory(categoryDTO);
    }
    @GetMapping(value = "/findById/{id}")
    public  Category findByCategoryId(@PathVariable Integer id){
       return categoryService.findByCategoryId(id);
    }
    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteByCategoryId(@PathVariable Integer id){
        categoryService.deleteByCategoryId(id);
    }
}
