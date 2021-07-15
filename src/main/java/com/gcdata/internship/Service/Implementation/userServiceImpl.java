package com.gcdata.internship.Service.Implementation;
import com.gcdata.internship.Model.User;
import com.gcdata.internship.Repository.UserRepository;
import com.gcdata.internship.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class userServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SequenceService sequenceService;


    // Add new User to the collection
    @Override
    public User registerUser(User user) {
        // increment the user id
        user.setId(sequenceService.getNextSequence("customSequence"));
        // save the user
        return userRepository.save(user);
    }

    @Override
    // modify an existing user
    public User updateUser(long id, User newUser) {
       User oldUser= this.getUserById(id);
       if (newUser.getFirstName()!=null)
           oldUser.setFirstName(newUser.getFirstName());
       if (newUser.getLastName()!=null)
           oldUser.setLastName(newUser.getLastName());
       if (newUser.getAddress()!=null)
           oldUser.setAddress(newUser.getAddress());
       if (newUser.getProducts()!=null)
           oldUser.setProducts(newUser.getProducts());

        return userRepository.save(oldUser);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        Optional<User> optionalUser= userRepository.findById(id);
        if (optionalUser.isPresent()){
            User user= optionalUser.get();
            return user;
        }
        else throw new NoSuchElementException("User does not exist with id = "+id);
    }

    @Override
    public void deleteUser(long id) {
       userRepository.deleteById(id);

    }
}
