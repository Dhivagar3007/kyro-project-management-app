package com.kyro.models;

import java.util.List;
import java.util.UUID;

/**
 * 
 * @author pughazhenthid
 *
 */

public class User {
   private UUID userID;
   private String name;
   UserType userType;
   List<Task> assignedTasks;
   List<Resource> resources;
   
   public boolean getFreeBusySchedule(userID);
   public void work();
}
