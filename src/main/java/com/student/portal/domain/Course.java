package com.student.portal.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "student_number")
    private String studentNumber;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_code")
    private String courseCode;


}
