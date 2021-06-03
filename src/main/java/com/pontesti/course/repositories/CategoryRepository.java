package com.pontesti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pontesti.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
