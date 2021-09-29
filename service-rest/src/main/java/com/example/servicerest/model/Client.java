package com.example.servicerest.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Client {

    @Id
    private String id;
    private String name;
    private Integer age;
}
