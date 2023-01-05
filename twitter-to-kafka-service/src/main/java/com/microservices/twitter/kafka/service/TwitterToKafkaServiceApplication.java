package com.microservices.twitter.kafka.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
    }

    // will run once only  == init
    // also we can user ApplicationListener the overridden method will also run once the difference is the parameters
    @Override
    public void run(String... args) throws Exception {
        log.info("Application started");
    }

}
