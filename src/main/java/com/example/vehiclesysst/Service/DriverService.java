package com.example.vehiclesysst.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehiclesysst.Domain.Driver;
import com.example.vehiclesysst.Repository.DriverRepository;

@Service
public class DriverService {
	 @Autowired
	    private DriverRepository repo;
	public List<Driver> listAll()
	{
	System.out.println(repo.findAll());
	        return repo.findAll();
	    }
	    
	 
	    public void save(Driver std) {
	        repo.save(std);
	    }
	    
	    public Driver get(long id) {
	        return repo.findById(id).get();
	    }
	    
	    public void delete(long id) {
	        repo.deleteById(id);
	    }
}
