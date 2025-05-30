package com.example.ConditionalOnPropertyTask.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Customer{

    @Id
    private int id;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return "Employee Details";
    }

    public Customer(int age, int id, String name) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public Customer() {
        System.out.println("Employee Constructor");
    }
}
