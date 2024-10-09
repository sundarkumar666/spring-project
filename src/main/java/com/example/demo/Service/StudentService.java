package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;

import java.util.ArrayList;

@Service
public class StudentService {

    List<Student> list = new ArrayList<>();

    public String createStudent(Student stu) {
        list.add(stu);
        return "saved succefully";
    }

    public List<Student> getAllStudent() {
        return list;
    }

    public String updateStudent(long id, Student newStudent) {
        for (Student studentList : list) {
            if (id == studentList.getId()) {
                list.set(list.indexOf(studentList), newStudent);
                return "update succefully";
            }
        }
        return "student not found";
    }

    public String deleteStudent(long id) {
        for (Student studentList : list) {
            if (id == studentList.getId()) {
                list.remove(list.indexOf(studentList));
                return "delete succefully";
            }
        }
        return "student not found";
    }
}
