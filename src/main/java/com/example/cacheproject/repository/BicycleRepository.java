package com.example.cacheproject.repository;

import com.example.cacheproject.entity.Bicycle;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicycleRepository extends CrudRepository<Bicycle, Long> {
  List<Bicycle> findAllByBrand(String brand);
}
