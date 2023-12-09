package com.example.mscandidat.Services;

import com.example.mscandidat.Entity.Category;
import com.example.mscandidat.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category addCategory(Category category){
        return categoryRepository.save(category);
    }
    public Category updateCategory(int id, Category newCategory) {
        if (categoryRepository.findById(id).isPresent()) {
            Category existingCategory = categoryRepository.findById(id).get();
            existingCategory.setNom(newCategory.getNom());
            existingCategory.setDescription(newCategory.getDescription());
            existingCategory.setType(newCategory.getType());

            return categoryRepository.save(existingCategory);
        } else
            return null;
    }

    public List<Category> findAllCategory(){
        return categoryRepository.findAll();
    }

    public String deleteCategory(int id) {
        if (categoryRepository.findById(id).isPresent()) {
            categoryRepository.deleteById(id);
            return "category supprimé";
        } else
            return "category non supprimé";
    }
}
