/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.steve.session;

import com.steve.domain.Student;
 
import javax.ejb.Stateless;  
import javax.persistence.EntityManager;  
import javax.persistence.PersistenceContext;  
  
/** 
 * 
 * @author Sameera Jayasekara 
 */  
@Stateless  
public class ManageStudentSessionBean implements ManageStudentSessionBeanLocal {  
  
    @PersistenceContext  
    private EntityManager entityManager;  
  
    /**
     *
     * @param student
     * @return
     */
    @Override
    public boolean addStudent(Student student) {  
  
        entityManager.persist(student);  
         
        return true;  
    }

    
} 
