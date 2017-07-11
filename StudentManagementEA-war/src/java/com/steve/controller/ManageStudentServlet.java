/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.steve.controller;

  
//import com.steve.domain.Student;  
import com.steve.domain.*;
import com.steve.session.ManageStudentSessionBeanLocal;  
  
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.ejb.EJB;  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
  
  
public class ManageStudentServlet extends HttpServlet {  
  
    @EJB  
    private ManageStudentSessionBeanLocal manageStudentSessionBean;  
    
  
  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
        response.setContentType("text/html;charset=UTF-8");  
        PrintWriter out = response.getWriter();  
        String message = "";  
  
        String firstName = request.getParameter("fname");  
        String lastName = request.getParameter("lname");  
        String email = request.getParameter("email");  
  
        Student student = new Student();  
        student.setFirstName(firstName);  
        student.setLastName(lastName);  
        student.setEmail(email);  
         
        if (manageStudentSessionBean.addStudent(student)) {  
            message = "Student Successfuly Added";  
        } else {  
            message = "Student Adding Failed";  
        }  
  
        request.setAttribute("message", message);  
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");  
        rd.forward(request, response);  
  
    }  
  
    @Override  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        processRequest(request, response);  
    }  
  
    @Override  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        processRequest(request, response);  
    }  
  
    @Override  
    public String getServletInfo() {  
        return "Short description";  
    }  
  
}  