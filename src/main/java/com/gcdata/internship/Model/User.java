package com.gcdata.internship.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;



@Data
@AllArgsConstructor
@Document(collection = "user")
public class User {
    @Id
    private long id;
    @Field
    private String firstName;
    @Field
    private String lastName;
    @Field
    private String email;
    /*
    * User Can Have Multiple Product
    * */
    @Field
    private List<Product> products;
    @Field
    private Address address;

}
