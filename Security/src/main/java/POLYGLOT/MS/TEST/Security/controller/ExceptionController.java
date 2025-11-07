package POLYGLOT.MS.TEST.Security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.security.auth.message.AuthException;

@ControllerAdvice // manejador de excepciones 
public class ExceptionController {

    @ExceptionHandler(value = {AuthException.class})
    public ResponseEntity<Object> handleAuthException(AuthException e){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
        .body(e.getMessage());

    }

    public ResponseEntity<Object> handleException(Exception e){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body("error en la ejecucion del servicio");

    }
}
