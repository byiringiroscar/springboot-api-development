package com.example.demo.job;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JobService {
    public List<Job> getJobs(){
        return List.of(
                new Job(
                        "Software engineer",
                        "Full-time",
                        true,
                        LocalDate.of(2025, 5, 10)
                ),
                new Job(
                        "Full stack",
                        "Full-time",
                        true,
                        LocalDate.of(2025, 5, 10)
                )
        );
    }
}
