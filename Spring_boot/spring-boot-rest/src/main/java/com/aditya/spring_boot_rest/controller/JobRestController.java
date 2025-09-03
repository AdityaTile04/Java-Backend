package com.aditya.spring_boot_rest.controller;

import com.aditya.spring_boot_rest.model.JobPost;
import com.aditya.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobRestController {

    @Autowired
   private JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost jobPost(@PathVariable("postId") int postId) {
        return service.getJob( postId );
    }

    @PostMapping("jobPost")
    public JobPost jobPost(@RequestBody JobPost jobPost) {
         service.addJob( jobPost );
         return jobPost;
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
        return jobPost;
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId) {
        service.deleteJob(postId);
        return "Post Deleted Successfully";
    }

}
