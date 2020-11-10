package com.example.springboot.simpleapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private String id;
    private String description;
    private String correctAnswer;
    private List<String> options;
}
