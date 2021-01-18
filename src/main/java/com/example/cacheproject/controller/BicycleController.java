package com.example.cacheproject.controller;

import com.example.cacheproject.dto.BicycleDto;
import com.example.cacheproject.entity.Bicycle;
import com.example.cacheproject.service.BicycleService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/bicycle")
public class BicycleController {
  private final BicycleService bicycleService;

  public BicycleController(BicycleService bicycleService) {
    this.bicycleService = bicycleService;
  }

  @PostMapping
  @CacheEvict(cacheNames="brandSearchRecord", allEntries = true)
  public Bicycle createBicycle(@RequestBody BicycleDto bicycleDto) {
    return bicycleService.createBicycle(BicycleDto.toPersist(bicycleDto));
  }

  @GetMapping("/{brand}")
  @Cacheable("brandSearchRecord")
  public List<Bicycle> findAllBicycleByBrand(@PathVariable String brand) {
    return bicycleService.findAllBicycleByBrand(brand);
  }

}
