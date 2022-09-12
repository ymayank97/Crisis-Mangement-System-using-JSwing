/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Hospital.HospitalDirectory;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidhi
 */
public class DoctorOrganization extends Organization{
    HospitalDirectory doctorList;
    //constructor to add doctor list to hospital directory
    public DoctorOrganization()
    {
        super(Organization.Type.Doctor.getValue());
        doctorList= new HospitalDirectory();
    }

    public HospitalDirectory getHospitallist() {
        return doctorList;
    }

    public void setHospitallist(HospitalDirectory doctorList) {
        this.doctorList = doctorList;
    }
    
    //hashmap to support doctor role
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new DoctorRole());
       return role;
    }
    
}
