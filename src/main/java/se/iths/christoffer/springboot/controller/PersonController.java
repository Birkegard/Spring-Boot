package se.iths.christoffer.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.christoffer.springboot.model.Person;

import java.util.List;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @GetMapping
    public String personList(Model model) {
        List<Person> personList = List.of(
                new Person(1, "Christoffer", 34, "christoffer@info.se"),
                new Person(2, "Jimmy", 32, "jimmy@info.se"),
                new Person(3, "Cassandra", 30, "cassandra@info.se")
        );
        model.addAttribute("persons", personList);
        return "persons";
    }
}
