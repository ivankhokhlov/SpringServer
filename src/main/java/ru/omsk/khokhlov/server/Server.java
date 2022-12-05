package ru.omsk.khokhlov.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Server {
    public static void main(String[] args) {
        System.out.println("-----");
        SpringApplication.run(Server.class,args);
        System.out.println("-----");


    }
}