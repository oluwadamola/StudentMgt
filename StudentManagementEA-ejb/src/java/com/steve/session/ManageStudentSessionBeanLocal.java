/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.steve.session;

import com.steve.domain.Student;
import javax.ejb.Local;  
  
/** 
 * 
 * @author Sameera Jayasekara 
 */  
@Local  
public interface ManageStudentSessionBeanLocal {  
  
    boolean addStudent(Student student);  
      
} 
