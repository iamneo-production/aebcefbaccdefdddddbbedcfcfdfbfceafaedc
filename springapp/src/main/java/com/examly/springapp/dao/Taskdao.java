package com.examly.springapp.dao;

import com.examly.springapp.entity.Task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Taskdao extends JpaRepository<Task,Long> {
    
}