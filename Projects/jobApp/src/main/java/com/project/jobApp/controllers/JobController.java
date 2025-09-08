package com.project.jobApp.controllers;

import com.project.jobApp.model.JobPost;
import com.project.jobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JobController {

    private final JobService service;

    @Autowired
    public JobController(JobService service) {
        this.service = service;
    }


 @GetMapping({"/", "home"})
 public String home() {
     return "home";
 }

 @GetMapping("addjob")
 public String addJob() {
     return "addjob";
 }

 @PostMapping("handleForm")
 public void handleForm(JobPost jobPost) {
     service.addJob( jobPost );

 }

@GetMapping("viewalljobs")
 public String viewJobs(Model model) {

    List<JobPost> jobs = service.getAllJobs();
    model.addAttribute( "jobPosts", jobs );
     return "viewalljobs";
 }

 @GetMapping("load")
 public String loadData() {
     service.load();
     return "success";
 }

}
