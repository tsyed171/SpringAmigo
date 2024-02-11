package com.talia.Entity;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.AllArgsConstructor;
import lombok.*;

//@Builder
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private String course;

    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

//    public String getCourse() {
//        return course;
//    }
//    public void setCourse(String course) {
//        this.course = course;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getId() {
//        return id;
//    }
//    public void setId(int id) {
//        this.id = id;
//    }

}

