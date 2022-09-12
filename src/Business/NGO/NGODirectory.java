/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.NGO;

import java.util.ArrayList;

/**
 *
 * @author vidhi
 */
public class NGODirectory {
    private ArrayList<NGO> ngodirectory;

    public NGODirectory() {
    ngodirectory= new ArrayList<>();
    }

    public ArrayList<NGO> getNgodirectory() {
        return ngodirectory;
    }

    public void setNgodirectory(ArrayList<NGO> ngodirectory) {
        this.ngodirectory = ngodirectory;
    }
    //add a NGO
    public NGO addNGO(){
        NGO ngo =new NGO();
        ngodirectory.add(ngo);
        return ngo;
    }
    //remove a NGO
    public void removeNGO(NGO ngo){
        ngodirectory.remove(ngo);   
    }
}
