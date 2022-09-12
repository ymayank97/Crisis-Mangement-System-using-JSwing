/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EventMaker;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author ymayank97
 */
public class EventMaker {
    private String name;
    private String id;
    private WorkQueue workQueue;
    
    private static int count=1;
    //Event maker class constructor
     public EventMaker(){
         
        id= "EM"+(++count);
        workQueue=new WorkQueue();
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     @Override
     public String toString(){
         return name;
     }
    
}

