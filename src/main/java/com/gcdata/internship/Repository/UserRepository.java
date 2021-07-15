package com.gcdata.internship.Repository;


import com.gcdata.internship.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,Long> {
}
