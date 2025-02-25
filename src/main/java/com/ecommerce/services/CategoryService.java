package com.ecommerce.services;

import com.ecommerce.dao.CategoryRepository;
import com.ecommerce.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService
{
    @Autowired
    private CategoryRepository categoryRepository;


    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    public Category addCategory(String name) {
        Category category = new Category();
        category.setName(name);
        return categoryRepository.save(category);
    }

    public boolean deleteCategory(int id) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            return true;
        }
        return false;
    }
    public Category updateCategory(int id, String name) {
        Optional<Category> optionalCategory = categoryRepository.findById(id);
        if (optionalCategory.isPresent()) {
            Category category = optionalCategory.get();
            category.setName(name);
            return categoryRepository.save(category);
        }
        return null;
    }
    public Category getCategory(int id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
