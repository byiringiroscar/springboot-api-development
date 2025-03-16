package com.example.demo.job;
import java.time.LocalDate;

public class Job {
    String jobName;
    String job_type;
    Boolean isAvailable;
    LocalDate postedAt;

    public Job(){

    }

    public Job (String jobName, String job_type, Boolean isAvailable, LocalDate postedAt){
        this.jobName = jobName;
        this.job_type = job_type;
        this.isAvailable = isAvailable;
        this.postedAt = postedAt;
    }
    public String getJobName() {
        return jobName;
    }

    public String getJob_type() {
        return job_type;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public LocalDate getPostedAt() {
        return postedAt;
    }
}
