package com.example.messfoodmanager.repository;

import com.example.messfoodmanager.entity.FoodRequest;
import com.example.messfoodmanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRequestRepository extends JpaRepository<FoodRequest, Long> {
    List<FoodRequest> findByRequestedBy(User user);
}
