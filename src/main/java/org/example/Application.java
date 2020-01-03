package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("Applicatiion.class");
        logger.info("Starting the application...");

        SpringApplication.run(Application.class, args);

    }
}
