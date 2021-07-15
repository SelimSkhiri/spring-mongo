package com.gcdata.internship.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customSequences")
@Data
@AllArgsConstructor

// Collection to store the last id on the collection user
public class CustomSequence {
    @Id
    private String id;
    private long sequence;
}
