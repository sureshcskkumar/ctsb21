package com.demo.exceptions;

public class GreetingException extends Exception {
    public GreetingException(){
        super();
    }
    public GreetingException(String message){
        super(message);
    }
    public GreetingException(Exception ex){
        super(ex);
    }
    public GreetingException(String m, Exception e){
        super(m, e);
    }
}