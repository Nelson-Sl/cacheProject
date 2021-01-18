package com.example.cacheproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "bicycle")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bicycle {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String brand;
  private String description;
  private double price;
}
