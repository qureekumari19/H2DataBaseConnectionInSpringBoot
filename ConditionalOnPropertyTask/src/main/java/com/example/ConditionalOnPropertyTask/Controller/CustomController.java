package com.example.ConditionalOnPropertyTask.Controller;

import com.example.ConditionalOnPropertyTask.Model.Customer;
import com.example.ConditionalOnPropertyTask.Service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomController {


    @Autowired
    CustomService customService;

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAllCustomers() {
       List<Customer> customers = customService.getAllCustomers();
       return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getDetailsByID(@PathVariable int id) {
        Optional<Customer> list=customService.getDetailsByID(id);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/init")
    public ResponseEntity<?> createEmployee(@RequestBody Customer customer) {
        customService.createEmployee(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

}
