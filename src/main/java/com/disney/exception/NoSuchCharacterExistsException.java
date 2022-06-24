package com.disney.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoSuchCharacterExistsException extends RuntimeException {

    private static final String MESSAGE = "There's no character with id: ";

    public NoSuchCharacterExistsException(Integer id){
        super(MESSAGE + id);
    }
}
