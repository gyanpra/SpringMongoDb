package com.example.mongodbApp.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Document
@Data
public class TodoDTO {

    @Id
    private String id;
    private String title;
    private String description;
    private boolean completed;
}
