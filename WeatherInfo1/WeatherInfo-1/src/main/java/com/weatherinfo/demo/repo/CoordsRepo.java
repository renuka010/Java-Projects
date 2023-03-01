package com.weatherinfo.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weatherinfo.demo.entity.Coords;

@Repository
public interface CoordsRepo extends CrudRepository<Coords,Long>{

	Coords findByPincode(int pincode);

}
