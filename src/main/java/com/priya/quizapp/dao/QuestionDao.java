package com.priya.quizapp.dao;

import com.priya.quizapp.Question;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Function;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {
    List<Question>findByCategory(String category);
}
