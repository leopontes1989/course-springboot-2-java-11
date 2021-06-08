package com.pontesti.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pontesti.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
