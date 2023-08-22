package com.oil.ecommerceoilapp.repository;

import com.oil.ecommerceoilapp.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Integer, Order> {
}
