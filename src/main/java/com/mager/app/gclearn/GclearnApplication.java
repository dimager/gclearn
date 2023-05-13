package com.mager.app.gclearn;

import com.google.cloud.spring.core.GcpProjectIdProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GclearnApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GclearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
