package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service  // Registers this class as a Spring Bean (same as @Service)
public class StudentService {
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
