package com.oil.ecommerceoilapp.repository;

import com.oil.ecommerceoilapp.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
