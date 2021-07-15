package com.gcdata.internship.Service;

import com.gcdata.internship.Model.User;

import java.util.List;

public interface UserService {
    User registerUser(User user);
    User updateUser(long id, User newUser);
    List<User> getAllUsers ();
    User getUserById(long id);
    void deleteUser(long id);
}
