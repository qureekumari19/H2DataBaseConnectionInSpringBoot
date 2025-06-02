package com.example.ConditionalOnPropertyTask.Service;


import com.example.ConditionalOnPropertyTask.Model.Customer;
import com.example.ConditionalOnPropertyTask.Respository.CustomRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
@Slf4j
public class CustomService {


    private CustomRepo customRepo;


    public CustomService(CustomRepo customRepo) {
        this.customRepo = customRepo;
    }

//    final static Logger logger = Logger.getLogger("CustomService");

    public List<Customer> getAllCustomers(){
        return customRepo.findAll();
    }

    public Optional<Customer> getDetailsByID(Integer id) {
        log.info("Getting the details of Customer with ID: " + id);
        Optional<Customer> employee=customRepo.findById(id);
        return employee;
    }

    public Customer createCustomer(Customer customer){
        log.info("Created Customer with the Details: "+customer.toString());
        customRepo.save(customer);
        return customer;
    }

    public void updateCustomer(Customer customer){
        log.info("Updating Customer with the Details with customer Id: "+customer.getId()+customer.toString());
        customRepo.save(customer);
    }

    public void deleteCustomerByID(int id){
        Customer customer1=customRepo.findById(id).get();
        log.info("Deleting Customer with ID: " + id+" from customer repo"+customer1.toString());
        customRepo.deleteById(id);
    }
}
