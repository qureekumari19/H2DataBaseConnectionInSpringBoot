package com.example.ConditionalOnPropertyTask.Respository;

import com.example.ConditionalOnPropertyTask.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomRepo extends JpaRepository<Customer, Integer> {
//    public List<Customer> findByName(String name);
}
