package com.ssafy.ssam.notification.entity;

import com.ssafy.ssam.classroom.entity.Board;
import com.ssafy.ssam.user.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private int questionId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "student_id", nullable = false)
    private User student;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    @NotNull
    @Column(length = 50, nullable = false)
    private String content;

    @Column
    private String answer;

    @NotNull
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "content_date", nullable = false)
    private Date contentDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "answer_date")
    private Date answerDate;

}
