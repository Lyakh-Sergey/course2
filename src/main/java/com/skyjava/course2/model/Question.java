package com.skyjava.course2.model;

public record Question(String question, String answer) {

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
