package com.example.ConditionalOnPropertyTask.Service;

import com.example.ConditionalOnPropertyTask.Model.Customer;
import com.example.ConditionalOnPropertyTask.Respository.CustomRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
public class CustomServiceTest {

    @Mock
    CustomRepo customRepo;

    @InjectMocks
    CustomService customService;

    @Test
    void addProductShouldAddProductSuccessfully(){
        Customer customer = new Customer();
        customer.setName("Test");
        customer.setAge(20);
        customer.setId(1);
        Mockito.when(customRepo.save(customer)).thenReturn(customer);
        Customer savedCustomer = customService.createCustomer(customer);
        customService.createCustomer(customer);

        Assertions.assertEquals(savedCustomer.getId(), customer.getId());
    }

    @Test
    void getAllProductsShouldReturnAllProductsSuccessfully(){
        Customer customer = new Customer();
        customer.setName("Test");
        customer.setAge(20);
        customer.setId(1);
        Mockito.when(customRepo.findAll()).thenReturn(Arrays.asList(customer));
        List<Customer> savedCustomer = customService.getAllCustomers();

        Assertions.assertEquals(savedCustomer.size(), 1);
    }
  
}