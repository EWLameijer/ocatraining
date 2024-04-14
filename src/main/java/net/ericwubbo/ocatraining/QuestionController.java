package net.ericwubbo.ocatraining;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/questions")
public class QuestionController {

    @GetMapping
    public List<Question> getAll() {
        return List.of(
                new Question("Which access modifier confers the smallest visibility?"),
                new Question("What is the difference between overriding and overloading?"));
    }

    @GetMapping("second")
    public String test2() {
        return "Dit is een test van de QuestionController 18:22";
    }
}
