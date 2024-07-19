package com.ssafy.ssam.classroom.entity;

import com.ssafy.ssam.notification.entity.Question;
import com.ssafy.ssam.user.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private int classId;

    @NotNull
    @Column(nullable = false, length = 45)
    private String pin;

    @Column
    private String banner;

    @Column(name = "banner_img")
    private String bannerImg;

    @Column
    private String notice;

    @Column(columnDefinition = "TINYINT CHECK (grade BETWEEN 1 AND 6)")
    private int grade;

    @Column(columnDefinition = "TINYINT")
    private int classroom;

    @Column(name = "consult_url")
    private String consultUrl;

    @ManyToMany(mappedBy = "boards")
    private List<User> users;

    @OneToMany(mappedBy = "board")
    private List<Question> questions;

}
