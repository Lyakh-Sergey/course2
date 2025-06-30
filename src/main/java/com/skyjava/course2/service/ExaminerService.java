package com.skyjava.course2.service;

import com.skyjava.course2.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
