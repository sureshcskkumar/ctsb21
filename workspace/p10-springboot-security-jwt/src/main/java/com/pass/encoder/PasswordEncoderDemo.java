package com.pass.encoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoderDemo {
    public static void main(String[] args) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedString = encoder.encode("hello@world");

        System.out.println(encodedString);

        System.out.println("match 1: "+encoder.matches("hello@world", encodedString));
        System.out.println("match 2: "+encoder.matches("hello@world", "$2a$10$0E.sjUP9.er6/8OFisGBk.oB5e0ZgONijEZPY7oyHPKm2fDstBXrO"));
        System.out.println("match 3: "+encoder.matches("hello_world", "$2a$10$0E.sjUP9.er6/8OFisGBk.oB5e0ZgONijEZPY7oyHPKm2fDstBXrO"));
    }
}