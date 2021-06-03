package com.pontesti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pontesti.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
