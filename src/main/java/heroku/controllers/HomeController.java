package heroku.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hej")
    public String hej() {
        return "hej";
    }

    @GetMapping("/shout")
    public String shout() {
        return "greet";
    }
}
