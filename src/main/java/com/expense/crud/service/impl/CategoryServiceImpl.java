package com.expense.crud.service.impl;

import com.expense.crud.dto.CategoryDto;
import com.expense.crud.entity.Category;
import com.expense.crud.mapper.CategoryMapper;
import com.expense.crud.repository.CategoryRepository;
import com.expense.crud.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    // constructor injection
    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {

        // convert CategoryDto to Category entity
        Category category = CategoryMapper.mapToCategory(categoryDto);

        // save category object into database table - categories
        Category savedCategory = categoryRepository.save(category);

        // convert savedCategory to CategoryDto
        return CategoryMapper.mapToCategoryDto(savedCategory);
    }


}
