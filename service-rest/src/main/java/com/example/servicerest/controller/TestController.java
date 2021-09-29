package com.example.servicerest.controller;

import com.example.servicerest.dto.TestMessage;
import com.example.servicerest.producer.TestRequestProd;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@AllArgsConstructor
@Slf4j
public class TestController {

    private final TestRequestProd producer;

    @PostMapping
    public void send(@RequestBody TestMessage message) {
        log.info("Posting {}", message);
        producer.send(message);
    }



}
