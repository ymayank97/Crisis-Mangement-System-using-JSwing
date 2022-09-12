/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidhi
 */
public class HospitalEnterprise extends Enterprise{
    public HospitalEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Hospital);
    }
    //hash map to for Doctor role addition
    @Override
    public HashSet<Role> getSupportedRole(){
       
        role.add(new DoctorRole());
     
        return role;
        
    }
}
