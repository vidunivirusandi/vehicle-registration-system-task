package com.example.vehiclesysst.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehiclesysst.Domain.Registration;
import com.example.vehiclesysst.Repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
    private RegistrationRepository repo;
public List<Registration> listAll() {
        return repo.findAll();
    }
    
    public void save(Registration registration) {
        repo.save(registration);
    }
    
    public Registration get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }

}
