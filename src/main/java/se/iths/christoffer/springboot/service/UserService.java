package se.iths.christoffer.springboot.service;

import org.springframework.stereotype.Service;
import se.iths.christoffer.springboot.model.User;

import java.util.List;

@Service
public class UserService {

    public List<User> userList() {
        List<User> userList = List.of(
                new User("chrbir", "lösenord", "Christoffer", 34),
                new User("axesta", "password", "Axel", 26),
                new User("pellar", "Godis", "Pelle", 56)
        );
        return userList;
    }
}
