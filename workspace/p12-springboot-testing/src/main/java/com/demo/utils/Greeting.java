package com.demo.utils;

import com.demo.exceptions.GreetingException;

public class Greeting {

    public String greetUser(String name) throws GreetingException{
        try{
            name = (name.charAt(0)+"").toUpperCase() + name.substring(1).toLowerCase();
            return "Welcome "+name;
        } catch(NullPointerException e){
            throw new GreetingException(e);
        } catch (StringIndexOutOfBoundsException e){
            throw new GreetingException(e);
        } catch (Exception e){
            throw new GreetingException(e);
        }
    }
    
}