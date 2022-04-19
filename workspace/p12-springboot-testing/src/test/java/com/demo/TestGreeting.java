package com.demo;

import com.demo.exceptions.GreetingException;
import com.demo.utils.Greeting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestGreeting {

    Greeting greeting = new Greeting();

    @Test
    public void shouldGreetUser() throws GreetingException{
        String name = "mArK";
        String result = greeting.greetUser(name);

        // result ==> Welcome Mark
        Assertions.assertEquals("Welcome Mark", result);
    }
    
    @Test
    public void shouldNotGreetUserWithNullArg(){
        Assertions.assertThrows(GreetingException.class, ()->{
            greeting.greetUser(null);
        });
    }
    
    @Test
    public void shouldNotGreetUserWithEmptyName(){
        Assertions.assertThrows(GreetingException.class, ()->{
            greeting.greetUser("");
        });
    }
    
}