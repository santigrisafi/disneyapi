package com.disney.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {NoSuchCharacterExistsException.class})
    public @ResponseBody ResponseEntity<ApiException> handleNoSuchCharacterExistsException(NoSuchCharacterExistsException e) {
        ApiException apiException = new ApiException(
                e.getMessage(),
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now()
        );
        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = CharacterAlreadyExistsException.class)
    public @ResponseBody ResponseEntity<ApiException> handleCharacterAlreadyExistsException(CharacterAlreadyExistsException e) {
        ApiException apiException = new ApiException(
                e.getMessage(),
                HttpStatus.BAD_REQUEST,
                ZonedDateTime.now()
        );
        return new ResponseEntity<>(apiException, HttpStatus.BAD_REQUEST);
    }

}
