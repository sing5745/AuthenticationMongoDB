/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.controllers;

import ca.sheridancollege.beans.User;
import ca.sheridancollege.database.MongoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Inder
 */
@WebServlet(name = "UserRegistration", urlPatterns = {"/uReg"})
public class UserRegistration extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String fname = request.getParameter("fName");
        String lname = request.getParameter("lName");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        
        
        User user = new User(fname,lname,pass,email);
        //HttpSession session = request.getSession();
        System.out.println(user.toString());
        String message = "";
        
        MongoDAO mongoDB = new MongoDAO();
        
        if(mongoDB.checkUser(user))
        {
            message = mongoDB.getMessage();
            request.setAttribute("message", message);
            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
            //response.sendRedirect("index.jsp");
            System.out.println(mongoDB.getMessage());
        }else
        {
            response.sendRedirect("registration.html");
            mongoDB.addUsers(user);
            System.out.println(mongoDB.getMessage());
        }
       
        
        
       
    }


}
