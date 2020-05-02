package com.paging.model;

import javax.persistence.*;

@Entity
@Table(name = "student_details")
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rollNo;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "course")
    private String course;

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
