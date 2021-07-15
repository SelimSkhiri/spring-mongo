package com.gcdata.internship.Endpoint;

import com.gcdata.internship.Model.User;
import com.gcdata.internship.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserEndpoint {

    @Autowired
    private UserService userService;

    @PostMapping()
    public User addUser(@RequestBody User user){
        return userService.registerUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable long id , @RequestBody User user){
        return userService.updateUser(id,user);
    }


    @GetMapping
    public List<User> getUsers(){
        return userService.getAllUsers();
    }


    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id){
        return userService.getUserById(id);
    }


    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable long id ){
        userService.deleteUser(id);
        return "User deleted successfully";
    }

}
