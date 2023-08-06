package com.examly.springapp.controller;
import java.util.List;

import com.examly.springapp.entity.Task;
import com.examly.springapp.services.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class COntrol {
    @Autowired
    private TaskService ts;
    @GetMapping("/alltasks")
    public List<Task> getallTask()
    {
        return this.ts.getallTask();
    }
    @GetMapping("/getTask/{taskid}")
    public Task getTask(@PathVariable String thd)
    {
        return this.ts.getTask(Long.parseLong(thd));
    }
    @PostMapping("/saveTask")
    public Task addTask(@RequestBody Task task)
    {
        return this.ts.addTask(task);
    }
    @PutMapping("/changeStatus/{taskStatus}")
    public Task updateTask(@RequestBody Task t)
    {
       return this.ts.updateTask(t);
    }
    @DeleteMapping("/deleteTask/{id}")
    public void deleteTask(@PathVariable String id)
    {
        this.ts.deleteTask(Long.parseLong(id));
    }
    
}

