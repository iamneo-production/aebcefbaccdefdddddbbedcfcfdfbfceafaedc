package com.examly.springapp.entity;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Task {
	@Id
    private long taskid;
    private String taskholdername;
    private Date taskdate;
    private String taskName;
    private String taskStatus;
    public Task(long taskid,String taskholdername,Date taskdate,String taskName,String taskStatus)
    {
        super();
        this.taskid=taskid;
        this.taskholdername=taskholdername;
        this.taskdate=taskdate;
        this.taskName=taskName;
        this.taskStatus=taskStatus;
        
    }
    public Task()
    {
        super();
    }
	public long getTaskid() {
		return taskid;
	}
	public void setTaskid(long taskid) {
		this.taskid = taskid;
	}
	public String getTaskholdername() {
		return taskholdername;
	}
	public void setTaskholdername(String taskholdername) {
		this.taskholdername = taskholdername;
	}
	public Date getTaskdate() {
		return taskdate;
	}
	public void setTaskdate(Date taskdate) {
		this.taskdate = taskdate;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	@Override
	public String toString() {
		return "Task [taskid=" + taskid + ", taskholdername=" + taskholdername + ", taskdate=" + taskdate
				+ ", taskName=" + taskName + ", taskStatus=" + taskStatus + "]";
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
}