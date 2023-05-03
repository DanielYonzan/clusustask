package com.daniel.clusustask.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

/**
 * @author Daniel Tamang
 * @since 5/3/2023
 */
@Slf4j
@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Object> handleRuntimeException(RuntimeException ex) {
        log.error("Runtime Exception: {}", ex);
        return new ResponseEntity<>("System error", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(DuplicateDealException.class)
    public ResponseEntity<Object> handleDuplicateDealException(
            DuplicateDealException ex, WebRequest request) {
        log.error("Deal already exist Exception: {}", ex);
        String errorMessage = ex.getMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.IM_USED);
    }

    @ExceptionHandler(DealValidationException.class)
    public ResponseEntity<Object> handleDealValidationException(DealValidationException ex) {
        log.error("Runtime Exception: {}", ex);
        return new ResponseEntity<>("Not Accepted", HttpStatus.NOT_ACCEPTABLE);
    }
}
