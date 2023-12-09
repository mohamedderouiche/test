package com.example.mscandidat.Repository;

import com.example.mscandidat.Entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours, Long> {
    List<Cours> findByTitleContaining(String title);
}