package com.example.nbp;


import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NbpApplication {

    public static void main(String[] args) throws UnirestException {
        SpringApplication.run(NbpApplication.class, args);

    }
}
