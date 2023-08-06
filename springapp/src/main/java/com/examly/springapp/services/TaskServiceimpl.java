package com.examly.springapp.services;
import java.util.List;

import com.examly.springapp.dao.Taskdao;
import com.examly.springapp.entity.Task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private Taskdao td;
    public List<Task> getallTask()
    {
        
        return td.findAll();
    }
    public Task getTask(long thn)
    {
        
        return td.getOne(thn);
    }
    @Override
    public Task addTask(Task t) {
       return td.save(t);
        
    }
    @Override
    public Task updateTask(Task t) {
       
        return td.save(t);

    }
    @Override
    public void deleteTask(long id) {
        
        Task entity=td.getOne(id);
        td.delete(entity);
    }

}
