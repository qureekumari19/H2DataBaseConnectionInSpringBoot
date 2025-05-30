package com.example.ConditionalOnPropertyTask.Controller;

import com.example.ConditionalOnPropertyTask.Exception.CustomException;
import com.example.ConditionalOnPropertyTask.Model.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<?> globalExceptionHandler(CustomException e) {
        return new ResponseEntity<>(new ErrorResponse(LocalDateTime.now(),e.getMessage(),"Customer Not Found"), HttpStatus.NOT_FOUND);
    }
}
