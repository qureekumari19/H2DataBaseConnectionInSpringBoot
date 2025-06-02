package com.example.ConditionalOnPropertyTask.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;

@Aspect
@Component
public class CustomAspect {

    @Before("execution(* com.example.ConditionalOnPropertyTask.Service.CustomService.createEmployee(..))")
    public void log(){
        System.out.println("CustomAspect log");
    }
}
