package com.example.serviceconsumer.config;


import com.example.serviceconsumer.dto.TestMessage;
import com.example.serviceconsumer.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class TestConfig {


    @Bean
    public Consumer<TestMessage> testConsumer(TestService service) {
        return message -> {
            log.info("New Message: {}", message);
            service.save(message);
        };
    }

}