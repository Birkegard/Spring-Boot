package se.iths.christoffer.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.christoffer.springboot.model.User;
import se.iths.christoffer.springboot.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUser(Model model) {
        List<User> userList = userService.userList();
        model.addAttribute("users", userList);
        return "users";
    }
}
