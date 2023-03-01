package com.weatherinfo.demo.repo;

import java.time.LocalDate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.weatherinfo.demo.entity.Weatherdata;

@Repository
public interface WeatherdataRepo extends CrudRepository<Weatherdata,Long>{

	Weatherdata findByPincodeAndDate(int pincode, LocalDate date);

}
