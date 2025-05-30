package com.example.ConditionalOnPropertyTask.Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErrorResponse {
    public LocalDateTime date;
    public String message;
    public String details;

    public ErrorResponse(LocalDateTime date, String details, String message) {
        this.date = date;
        this.details = details;
        this.message = message;
    }
}
