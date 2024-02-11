package com.talia.Dao;

import com.talia.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository //automatically identifies this as a class and instantiates all the beans
@Qualifier("fakeData") //used to identify where the data comes from
public class FakeDataStudentDao implements StudentDao {
    private static Map<Integer, Student> students;

    static{
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Zaid", "Computer Science"));
                put(2, new Student(2, "Alex", "Finance"));
                put(3, new Student(3, "Layla", "Business"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents(){

        return students.values();
    }

    @Override
    public Student getStudentById(int id){
        return students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
        students.remove(id);
    }

    @Override
    public void updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(), student);
    }

    @Override
    public void insertStudent(Student student) {
        students.put(student.getId(), student);
    }
}
