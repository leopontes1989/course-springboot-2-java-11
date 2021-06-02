package com.pontesti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pontesti.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
