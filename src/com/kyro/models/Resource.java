package com.kyro.models;

import java.util.UUID;

/**
 * @author pughazhenthid
 *
 */
public class Resource {
   private UUID resourceID;
   private String name;
   ResourceType resourceType;
   ResourceStatus status;
   
   /*
    * This method returns the status for resource whether is available to
    * allocate
    */
   public ResourceStatus getCurrentStatus(resourceID);
}
