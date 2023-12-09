package com.example.mscandidat.Repository;

import com.example.mscandidat.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
