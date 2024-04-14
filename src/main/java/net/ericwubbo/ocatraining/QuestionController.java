package net.ericwubbo.ocatraining;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/questions")
public class QuestionController {
    private final QuestionRepository questionRepository;

    public QuestionController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping
    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    @PostMapping
    void create(@RequestBody Question question) {
        questionRepository.save(question);
    }
}
