package fpt.aptech.assignment2.service.impl;

public class GlobalExceptionHandler extends RuntimeException{
    public GlobalExceptionHandler(String message, String id) {
        super(message);
    }
}
