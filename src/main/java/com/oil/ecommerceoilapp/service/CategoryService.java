package com.oil.ecommerceoilapp.service;

import com.oil.ecommerceoilapp.dto.CategoryDTO;
import com.oil.ecommerceoilapp.entity.Category;
import com.oil.ecommerceoilapp.repository.CategoryRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
   private CategoryRepository categoryRepository;

    public void saveCategory(CategoryDTO categoryDTO){

        Category category=  new Category();

        category.setId(categoryDTO.getId());
        category.setCategoryName(categoryDTO.getCategoryName());
        category.setImageURL(categoryDTO.getImageURL());
        category.setEnabled(true);

        categoryRepository.save(category);
    }

    public Category findByCategoryId(Integer id){
        return categoryRepository.findById(id).orElse(null);
    }

    public void deleteByCategoryId(Integer id){
        categoryRepository.deleteById(id);
    }

    @Transactional
    public Category updateCategory(Integer categoryId, CategoryDTO updatedCategoryDTO) {
        Category existingCategory = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new EntityNotFoundException("Category not found"));

        existingCategory.setCategoryName(updatedCategoryDTO.getCategoryName());
        existingCategory.setImageURL(updatedCategoryDTO.getImageURL());
        existingCategory.setEnabled(updatedCategoryDTO.getEnabled());

        return categoryRepository.save(existingCategory);
    }

    public List<Category> findAllCategory(){
        return categoryRepository.findAll();
    }
}
