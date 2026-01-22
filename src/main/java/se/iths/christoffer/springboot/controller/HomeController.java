package se.iths.christoffer.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.christoffer.springboot.service.HomeService;

@Controller
@RequestMapping("/")
public class HomeController {
    //HomeController använder HomeService via dependency injection
    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping
    public String home(Model model) {
        model.addAttribute("name", "Christoffer");
        return "index";
    }
}
