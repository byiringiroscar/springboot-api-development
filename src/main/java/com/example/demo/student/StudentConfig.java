package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student oscar = new Student(
                    "oscar",
                    "oscar@gmail.com",
                    LocalDate.of(2000, AUGUST, 5),
                    21
            );

            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2020, AUGUST, 5),
                    35
            );

            repository.saveAll(
                    List.of(oscar, alex)
            );

        };
    }
}
