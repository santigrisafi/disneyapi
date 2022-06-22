package com.disney.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CharacterAlreadyExistsException extends RuntimeException {

    public CharacterAlreadyExistsException(Integer id) {
        super("A character with id:" + id + " already exists");
    }

}
