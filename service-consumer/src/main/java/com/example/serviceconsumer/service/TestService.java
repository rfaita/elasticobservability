package com.example.serviceconsumer.service;

import com.example.serviceconsumer.dto.TestMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TestService {

    public void save(TestMessage testMessage) {

        log.info("Saving: {}", testMessage);

    }

}
