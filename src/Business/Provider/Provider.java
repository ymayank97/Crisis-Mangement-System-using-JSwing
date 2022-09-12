/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Provider;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author vidhi
 */
public class Provider {
    private String sName;
    private static int sCount=1;
    private String supplierId;
    private WorkQueue workQueue;
    private ItemDirectory itemDirectory;
    private Item item;
    //provider class constructor to update ids, work queue and item directory
    public Provider() {
        
        supplierId = "SUP"+(++sCount);
        workQueue= new WorkQueue();
        itemDirectory = new ItemDirectory();
        item = new Item();
    }
    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    public ItemDirectory getItemDirectory() {
        return itemDirectory;
    }

    public void setItemDirectory(ItemDirectory itemDirectory) {
        this.itemDirectory = itemDirectory;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString(){
        return sName;
    }
}
