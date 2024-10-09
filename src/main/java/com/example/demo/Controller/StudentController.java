package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3030") // Replace with your frontend URL

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentServiceImp;

    @Autowired
    public StudentController(StudentService studentServiceImp) {
        this.studentServiceImp = studentServiceImp;
    }

    @PostMapping("/add")
    public String createStudent(@RequestBody Student stu) {
        return studentServiceImp.createStudent(stu);
    }

    @GetMapping("/all")
    public List<Student> getAllStudent() {
        return studentServiceImp.getAllStudent();
    }

    @PutMapping("/update/{id}")
    public String updateStudent(@RequestBody Student stu, @PathVariable long id) {
        return studentServiceImp.updateStudent(id, stu);

    }

    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable long id) {
        return studentServiceImp.deleteStudent(id);
    }

}
