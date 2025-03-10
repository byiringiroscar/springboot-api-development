package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "ap1/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        2L,
                        "oscar",
                        "oscar@gmail.com",
                        LocalDate.of(2025, 5, 10),
                        25

                )
        );
    }
}
