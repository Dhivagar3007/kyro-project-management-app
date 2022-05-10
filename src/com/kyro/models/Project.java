package com.kyro.models;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author pughazhenthid
 *
 */
public class Project {
    private UUID projectID;
    private String projectName;
    private String Description;
    private Date startDate;
    private Date endDate;
    private List<Resource> resources;
    private List<Task> tasks;
    private List<User> users;
	
    /*
     * This method is used to allocate the users based on availability
     * for specific tasks
     */
    public void allocateUsersForTasks();
    
    /*
     * This method is used to check whether user is available to assign the specific tasks
     */
    public boolean isUserAvailableForAssignment();
    
    /*
     * This method is used to determine whether project can be completed by a given date
     */
    public boolean isProjectCompleted(date);
}
