package com.devsuperior.bds02.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 4333061262017367368L;

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
