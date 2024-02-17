package com.microservice.demo.to.kafka.service;

import com.microservice.demo.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    // Log variable for logging
    private static final Logger LOG= LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);

    // Inject twitter config data class to main class
    private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;

    public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfigData configData) {
        this.twitterToKafkaServiceConfigData = configData;
    }

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
    }

    // Initialization Logic for getting twitter data
    @Override
    public void run(String... args) throws Exception {
        LOG.info("Application starts...");
        // print Log Array
        LOG.info(Arrays.toString(twitterToKafkaServiceConfigData.getTwitterKeywords().toArray(new String[] {})));
        // print log message(string)
        LOG.info(twitterToKafkaServiceConfigData.getWelcomeMessage());
    }

}