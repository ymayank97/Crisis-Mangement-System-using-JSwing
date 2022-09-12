/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FireMan;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author vidhi
 */
public class FireMan {
    private String Name;
    private static int Count=1;
    private String FireManId;
    private WorkQueue workQueue;
    //Fire man constructor which automatically generates id
    public FireMan() {
        
        FireManId = "FireMan"+(++Count);
        workQueue= new WorkQueue();
    }
    
    public static int getCount() {
        return Count;
    }

    public static void setCount(int Count) {
        FireMan.Count = Count;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getFireManId() {
        return FireManId;
    }

    public void setFireManId(String FireManId) {
        this.FireManId = FireManId;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
       
    
        @Override
    public String toString(){
        return Name;
    }
}
