package com.example.vehiclesysst.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.vehiclesysst.Domain.Driver;

@Repository
public interface DriverRepository  extends JpaRepository<Driver, Long>
{
	@Query(value="select d.id, d.drname, r.registration_plate from driver d Inner JOIN registration r ON d.registration=r.id", nativeQuery=true)
	List<Object[]> findDriver();

}
