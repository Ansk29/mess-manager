package com.example.messfoodmanager.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodItemDto {
    private Long id;
    private String name;
    private Integer quantity;
    private String shelfLife;
    private boolean isAvailable;
    private LocalDateTime createdAt;
    private UserDto postedBy;
}