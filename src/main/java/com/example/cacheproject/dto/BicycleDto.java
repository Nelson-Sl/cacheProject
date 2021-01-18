package com.example.cacheproject.dto;

import com.example.cacheproject.entity.Bicycle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BicycleDto {
  private String brand;
  private String description;
  private double price;

  public static Bicycle toPersist(BicycleDto bicycleDto) {
    return Bicycle.builder()
        .brand(bicycleDto.getBrand())
        .description(bicycleDto.getDescription())
        .price(bicycleDto.getPrice())
        .build();
  }
}
