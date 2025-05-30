package com.example.ConditionalOnPropertyTask.Exception;

public class CustomException extends Exception {
    public CustomException(String message) {
        System.out.print(message);
    }
}
