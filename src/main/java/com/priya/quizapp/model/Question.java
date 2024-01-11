package com.priya.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name="question")
public class Question {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @SequenceGenerator(name="ques_generator", sequenceName = "ques_seq", allocationSize=1)
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultylevel;
    private String category;

}
