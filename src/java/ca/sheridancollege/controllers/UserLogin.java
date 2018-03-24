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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Inder
 */
@WebServlet(name = "UserLogin", urlPatterns = {"/uLogin"})
public class UserLogin extends HttpServlet {

   

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        String password = request.getParameter("pass");        
       
        
            User user = new User();    
            user.setEmail(email);
            user.setPassword(password);
            System.out.println(user.toString());
            MongoDAO mongoDB = new MongoDAO(); 

            if( mongoDB.checkUser(user) == true)
            {
                response.sendRedirect("registration.html");
                System.out.println("Logged In");
            }
            else{
                response.sendRedirect("index.jsp");
                System.out.println("Ok");
            }
            
        
        
    }

    
}
