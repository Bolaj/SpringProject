package com.timibolaji.Springboot.project.exception;

import com.timibolaji.Springboot.project.entity.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityHandler
        extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DepartmentNotFound.class)
    public ResponseEntity<ErrorMessage> departmentNotFoundException(DepartmentNotFound exception,
                                                                    WebRequest request){
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,
                exception.getMessage());

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(message);
    }
}
