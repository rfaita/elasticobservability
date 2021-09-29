package com.example.servicerest.producer;

import com.example.servicerest.dto.TestMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class TestRequestProd {

    private final StreamBridge streamBridge;

    public void send(TestMessage req) {
        log.info("Sending: {}", req);
        streamBridge.send("testRequestProducer-out-0", req);
    }

}
