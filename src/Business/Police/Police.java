/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Police;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author vidhi
 */
public class Police {
    private String Name;
    private static int Count=1;
    private String PoliceId;
    private WorkQueue workQueue;
    //Police class constructor to autogenerate id
    public Police() {
        
        PoliceId = "Police"+(++Count);
        workQueue= new WorkQueue();
    }
    
    public static int getCount() {
        return Count;
    }

    public static void setCount(int Count) {
        Police.Count = Count;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPoliceId() {
        return PoliceId;
    }

    public void setPoliceId(String PoliceId) {
        this.PoliceId = PoliceId;
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
