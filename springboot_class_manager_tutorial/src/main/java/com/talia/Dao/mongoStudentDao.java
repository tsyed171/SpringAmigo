package com.talia.Dao;

import com.talia.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class mongoStudentDao implements StudentDao{
    private static ArrayList<Student> studentsMongo;

    static{
        studentsMongo = new ArrayList<Student>(){
            {
                add(new Student(1, "Zulfiqar" ,"Philosophy"));
                add(new Student(2, "Ras Al-Ghul" ,"Kinesiology"));
            }
        };
    }

    @Override
    public ArrayList<Student> getAllStudents() {
        return studentsMongo;
    }

    @Override
    public Student getStudentById(int id) {
        int index = 0;
        for (Student student : studentsMongo){
            if (student.getId() == id){
                index = studentsMongo.indexOf(student);
            }
        }
        return studentsMongo.get(index);
    }

    @Override
    public void removeStudentById(int id) {
        int index = 0;
        for (Student student : studentsMongo){
            if (student.getId() == id){
                index = studentsMongo.indexOf(student);
            }
        }
        studentsMongo.remove(index);
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
