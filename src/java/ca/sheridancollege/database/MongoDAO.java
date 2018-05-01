/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.database;

import ca.sheridancollege.beans.User;
import com.mongodb.*;
import java.util.ArrayList;

/**
 *
 * @author Inder
 */
public class MongoDAO {
    
 
    private String message;
    ArrayList<User> usersList = new ArrayList();
    
    MongoClientURI uri = new MongoClientURI("mongodb://root:root@ds115214.mlab.com:15214/mydb");
    MongoClient client = new MongoClient(uri);
    DB db = client.getDB(uri.getDatabase());
    DBCollection userCollection = db.getCollection("texts");
    
    public void addUsers(User u)
    {
       
        BasicDBObject dbo = new BasicDBObject();
        dbo.append("firstname", u.getFirstname());
        dbo.append("lastname", u.getLastname());
        dbo.append("email", u.getEmail());
        dbo.append("password", u.getPassword());
       // dbo.append("lastname", u.);
        
        userCollection.insert(dbo);
        client.close();
    }
    
      public boolean checkUser(User u)
    {
         boolean[] b = new boolean[1];
         
       
    for (DBObject obj : userCollection.find()) {
        
            String email = (String) obj.get("email");
            String password = (String) obj.get("password");
            
           
             if(u.getEmail().equals(email) && u.getPassword().equals(password))
             {
               b[0] = true; 
               setMessage("User Already Exists");
               
             }
            /** Need to fix for the login  **/
             else if(u.getEmail().equals(email) || u.getPassword().equals(password))
            {       
                b[0] = true; 
                setMessage("Username name or password exists ");
            }

        }
         
      
     return b[0];
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<User> usersList) {
        this.usersList = usersList;
    }
      
      public boolean checkUserLogin(User u)
    {
         boolean[] b = new boolean[1];
         
       
    for (DBObject obj : userCollection.find()) {
        
            String email = (String) obj.get("email");
            String password = (String) obj.get("password");
             String fName = (String) obj.get("firstname");
             String lName = (String) obj.get("lastname");
            
            User user = new User(fName,lName,password,email);
            usersList.add(user);
            System.out.println(email + " " + password);
            
             if(u.getEmail().equals(email) && u.getPassword().equals(password))
             {
               b[0] = true; 
               
             }
             else{
                 setMessage("Couldn't find you");
             }

        }
     setUsersList(usersList);  
     client.close();
     
     return b[0];
    }  

    public void setMessage(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }
}
