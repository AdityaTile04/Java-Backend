package com.project.jobApp.controllers;

import com.project.jobApp.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobController {

 @GetMapping({"/", "home"})
 public String home() {
     return "home";
 }

 @GetMapping("addjob")
 public String addJob() {
     return "addjob";
 }

 @PostMapping("handleForm")
 public String handleForm(JobPost jobPost) {
     return "success";
 }

 @GetMapping("viewalljobs")
 public String allJobs() {
     return "viewalljobs";
 }

}
