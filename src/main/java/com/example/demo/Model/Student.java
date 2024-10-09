package com.example.demo.Model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Student {

    @Id
    private long id;
    private String name;
    private int age;
    private double fee;

}
