package com.th.example.datadapter.exception.handler;


import com.th.example.datadapter.model.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleError(Exception ex) {
        log.error("handle exception", ex);
        return ResponseEntity.status(500).body(new ErrorResponse());
    }
}
