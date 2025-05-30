package com.example.ConditionalOnPropertyTask.Service;


import com.example.ConditionalOnPropertyTask.Model.Customer;
import com.example.ConditionalOnPropertyTask.Respository.CustomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomService {

    @Autowired
    CustomRepo customRepo;

    public List<Customer> getAllCustomers(){
        return customRepo.findAll();
    }

    public Optional<Customer> getDetailsByID(Integer id) {
        Optional<Customer> employee=customRepo.findById(id);
        return employee;
    }

    public void createEmployee(Customer customer){
        customRepo.save(customer);
    }
}
