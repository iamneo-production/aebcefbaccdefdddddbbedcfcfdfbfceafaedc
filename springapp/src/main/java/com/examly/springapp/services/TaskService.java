package com.examly.springapp.services;
import com.examly.springapp.entity.Task;
import java.util.*;
public interface TaskService {
    public List<Task> getallTask();
    public Task getTask(long taskid);
    public Task addTask(Task t);
    public Task updateTask(Task t);
    public void deleteTask(long id);
}
