package net.ericwubbo.ocatraining;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/questions")
public class QuestionController {

    private final List<Question> questions = new ArrayList<>(List.of(
            new Question("Which access modifier confers the smallest visibility?"),
            new Question("What is the difference between overriding and overloading?")));

    @GetMapping
    public List<Question> getAll() {
        return questions;
    }

    @PostMapping
    void create(@RequestBody Question question) {
        questions.add(question);
    }
}
