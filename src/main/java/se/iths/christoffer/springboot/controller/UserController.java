package se.iths.christoffer.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.christoffer.springboot.model.User;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String getUser(Model model) {
        List<User> userList = List.of(
                new User("chrbir", "lösenord", "Christoffer", 34),
                new User("axesta", "password", "Axel", 26),
                new User("pellar", "Godis", "Pelle", 56)
        );
        model.addAttribute("users", userList);
        return "users";
    }
}
