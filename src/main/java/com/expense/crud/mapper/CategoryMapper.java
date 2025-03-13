package com.expense.crud.mapper;

import com.expense.crud.dto.CategoryDto;
import com.expense.crud.entity.Category;

public class CategoryMapper {

    // Map CategoryDto to Category entity
    public static Category mapToCategory(CategoryDto categoryDto) {

        return new Category(
                categoryDto.id(),
                categoryDto.name()
        );
    }

    // Map Category entity to CategoryDto
    public static CategoryDto mapToCategoryDto(Category category) {

        return new CategoryDto(
                category.getId(),
                category.getName()
        );
    }

}
