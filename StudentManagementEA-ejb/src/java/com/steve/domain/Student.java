/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.steve.domain;



import java.io.Serializable;  
import javax.persistence.*;  
  
@Entity  
@Table(name = "student")  
public class Student implements Serializable {  
  
    @Id  
    @GeneratedValue  
    @Column(name = "id")  
    private Integer id; 
    
    @Column(name = "first_name", length = 100)  
    private String firstName;  
    
    @Column(name = "last_name", length = 100)  
    private String lastName;  
    
    @Column(name = "email", length = 100)  
    private String email;  
  
    public String getEmail() {  
        return email;  
    }  
  
    public void setEmail(String email) {  
        this.email = email;  
    }  
  
    public String getFirstName() {  
        return firstName;  
    }  
  
    public void setFirstName(String firstName) {  
        this.firstName = firstName;  
    }  
  
    public Integer getId() {  
        return id;  
    }  
  
    public void setId(Integer id) {  
        this.id = id;  
    }  
  
    public String getLastName() {  
        return lastName;  
    }  
  
    public void setLastName(String lastName) {  
        this.lastName = lastName;  
    }  
}  
