/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author vidhi
 */
public class Volunteer {
    private String volunteerName;
    private String id;
    private static int count=1;
    private WorkQueue workqueue;
    //Volunteer class constructor to autogenerate id
    public Volunteer() {
        id="Vol"+(++count);
        workqueue= new WorkQueue();
    }
    
    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }
    
    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString(){
    return volunteerName;
    
    }
}
