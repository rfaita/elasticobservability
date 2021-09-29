package com.example.servicerest.controller;

import com.example.servicerest.model.Client;
import com.example.servicerest.repository.ClientRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/client")
@AllArgsConstructor
@Slf4j
public class ClientController {

    private final ClientRepository clientRepository;

    @PostMapping
    public Client save(@RequestBody Client client) {
        log.info("Saving: {}", client);
        return clientRepository.save(client);
    }

    @GetMapping
    public List<Client> findAll() {
        log.info("Finding");
        return clientRepository.findAll();
    }

}
