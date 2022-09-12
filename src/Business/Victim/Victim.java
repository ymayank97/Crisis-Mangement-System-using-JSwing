/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Victim;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author vidhi
 */
public class Victim {
    private String name;
    private String id;
    private WorkQueue workqueue;
    
    private static int count=1;
    //victim class constructor to autogenerate id
     public Victim(){
         
        id= "Victim"+(++count);
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }
 
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     
     @Override
     public String toString(){
         return name;
     }
}
