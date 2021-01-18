package com.example.cacheproject.service;

import com.example.cacheproject.entity.Bicycle;
import com.example.cacheproject.repository.BicycleRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BicycleService {
  private final BicycleRepository bicycleRepository;

  public BicycleService(BicycleRepository bicycleRepository) {
    this.bicycleRepository = bicycleRepository;
  }

  public Bicycle createBicycle(Bicycle bicycle) {
    return bicycleRepository.save(bicycle);
  }

  public List<Bicycle> findAllBicycleByBrand(String brand) {
    return bicycleRepository.findAllByBrand(brand);
  }
}
