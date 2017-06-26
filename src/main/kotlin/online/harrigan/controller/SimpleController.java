package online.harrigan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@Controller
public class SimpleController {

    @GetMapping
    public String get(final Model model) {
        model.addAttribute("name", "w00t");
        return "index";
    }
}
