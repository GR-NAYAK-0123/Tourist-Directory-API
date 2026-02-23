package com.tourist.Tourist_Register.exception;

import com.tourist.Tourist_Register.entity.ErrorDetails;
import com.tourist.Tourist_Register.error.TouristNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TouristNotFoundException.class)
    public ResponseEntity<?> touristNotFoundException(TouristNotFoundException tnf){
        ErrorDetails details = new ErrorDetails(LocalDateTime.now(),tnf.getMessage(),"404-Tourist Not Found");
        return new ResponseEntity<>(details, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> HandleAllException(Exception e){
        ErrorDetails details = new ErrorDetails(LocalDateTime.now(), e.getMessage(), "Problem in Execution");
        return new ResponseEntity<>(details, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
