package net.ericwubbo.ocatraining;

import jakarta.persistence.*;

@Entity
public class Question {
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    public Question() {
    }

    public Question(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
