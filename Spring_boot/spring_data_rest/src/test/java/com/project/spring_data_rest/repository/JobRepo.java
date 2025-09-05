package com.project.spring_data_rest.repository;

import com.project.spring_data_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepo extends JpaRepository<JobPost, Integer> {
}
