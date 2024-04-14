package net.ericwubbo.ocatraining;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
    @GetMapping
    public String test() {
        return "Dit is een test van de QuestionController";
    }

    @GetMapping("second")
    public String test2() {
        return "Dit is een test van de QuestionController 18:22";
    }
}
