package com.example.messfoodmanager.repository;

import com.example.messfoodmanager.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
    List<FoodItem> findByIsAvailableTrue();
}