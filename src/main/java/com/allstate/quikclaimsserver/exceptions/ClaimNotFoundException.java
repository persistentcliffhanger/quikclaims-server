package com.allstate.quikclaimsserver.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Claim not found")
public class ClaimNotFoundException extends Exception{

    public ClaimNotFoundException(String message) {
        super(message);
    }


}