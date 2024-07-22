package com.ssafy.ssam.user.entity;

import com.ssafy.ssam.classroom.entity.Board;
import com.ssafy.ssam.classroom.entity.Manage;
import com.ssafy.ssam.classroom.entity.School;
import com.ssafy.ssam.consult.entity.Appointment;
import com.ssafy.ssam.consult.entity.UnavailableSlot;
import com.ssafy.ssam.notification.entity.Alarm;
import com.ssafy.ssam.notification.entity.Question;
import com.ssafy.ssam.user.converter.UserRoleConverter;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @NotNull
    @Column(name = "name", length = 22, nullable = false)
    private String name;

    @NotNull
    @Email
    @Column(name = "email", length = 45, nullable = false)
    private String email;

    @NotNull
    @Column(name = "phone", length = 11, nullable = false)
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id")
    private School school;

    @Column(name = "img_url")
    private String imgUrl;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Convert(converter = UserRoleConverter.class)
    @Column(nullable = false)
    private UserRole role;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date birth;

    @Column(name = "other_name")
    private String otherName;

    @Column(name = "other_phone")
    private String otherPhone;

    @Column(name = "other_relation", length = 1)
    private String otherRelation;

    @NotNull
    @Column(nullable = false, unique = true, length = 20)
    private String username;

    @NotNull
    @Column(nullable = false)
    private String password;

    @ManyToMany
    @JoinTable(
            name = "user_board_relation",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "board_id")
    )
    private List<Board> boards;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<Manage> followings;

    @OneToMany(mappedBy = "teacher", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<Manage> followers;

    @OneToMany(mappedBy = "student")
    private List<Question> questions;

    @OneToMany(mappedBy = "student")
    private List<Appointment> studentAppointments;

    @OneToMany(mappedBy = "teacher")
    private List<Appointment> teacherAppointments;

    @OneToMany(mappedBy = "teacher")
    private List<UnavailableSlot> unavailableSlots;

    @OneToMany(mappedBy = "user")
    private List<Alarm> alarms;

}
