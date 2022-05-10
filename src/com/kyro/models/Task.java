package com.kyro.models;

import java.util.List;
import java.util.UUID;

/**
 * @author pughazhenthid
 *
 */

public class Task {
	private UUID taskID;
	private UUID projectID;
	private String taskName;
	private String Description;
    UserType userTypeRequired;
	private  List<Resource> resources;
	private  int hoursAllocated;   
	private List<Task> Dependency;
	private List<User> users;
    TaskStatus status;
    TaskPriority priority;
	
    /*
     * This method is used to start the particular task
     * */
	public boolean startTask();
	
	/*
	 * This method is used to end the specific task
	 */
	public boolean endTask();
	
	/*
	 * This method will free the resource once task has been completed
	 */
	public boolean freeResource();
	
	/*
	 * This method returns the status of the task
	 */
	public TaskStatus getCurrentStatus(taskID);
}
