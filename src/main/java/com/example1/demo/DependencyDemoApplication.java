package com.example1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ConcurrentModificationException;
import java.util.concurrent.Callable;

@SpringBootApplication
public class DependencyDemoApplication {

    public static void main(String[] args) {

       ConcurrentModificationException  context=
               (ConcurrentModificationException) SpringApplication.run(DependencyDemoApplication.class, args);
        String c;
        c = context.getBean(Customers.class);

    }
        }
       





