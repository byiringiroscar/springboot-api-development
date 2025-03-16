package com.example.demo.job;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "ap1/v1/job")
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService){this.jobService =jobService;}


    @GetMapping
    public List<Job> getJob(){
        return jobService.getJobs();
    }
}
