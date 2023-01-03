package com.devsuperior.bds02.services.exceptions;

public class DataBaseException extends RuntimeException {
    private static final long serialVersionUID = 4333061262017367368L;

    public DataBaseException(String msg) {
        super(msg);
    }
}
