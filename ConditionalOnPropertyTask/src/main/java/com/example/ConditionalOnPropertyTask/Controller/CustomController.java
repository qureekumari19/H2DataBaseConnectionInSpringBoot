package com.example.ConditionalOnPropertyTask.Controller;

import com.example.ConditionalOnPropertyTask.Exception.CustomException;
import com.example.ConditionalOnPropertyTask.Model.Customer;
import com.example.ConditionalOnPropertyTask.Model.ErrorResponse;
import com.example.ConditionalOnPropertyTask.Service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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
    public ResponseEntity<?> getDetailsByID(@PathVariable int id) throws CustomException {
            Optional<Customer> list= Optional.ofNullable(customService.getDetailsByID(id).orElseThrow(() -> new CustomException("Customer Not Found for id: " + id)));
            return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/init")
    public ResponseEntity<?> createEmployee(@RequestBody Customer customer) throws CustomException {
        if(customService.getDetailsByID(customer.getId()).isPresent()){
            return new ResponseEntity<>(customService.getDetailsByID(customer.getId()).get(), HttpStatus.CONFLICT);
        }
        customService.createEmployee(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

}
