package com.example.messfoodmanager.dto;



import com.example.messfoodmanager.entity.RequestStatus;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodRequestDto {
    private Long id;
    private Integer quantityRequested;
    private RequestStatus status;
    private LocalDateTime requestedAt;
    private FoodItemDto foodItem;
    private UserDto requestedBy;
}
