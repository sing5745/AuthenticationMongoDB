/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.database;

import ca.sheridancollege.beans.User;
import com.mongodb.*;

/**
 *
 * @author Inder
 */
public class MongoDAO {
    
     MongoClient mongo = new MongoClient(new ServerAddress("Localhost", 27017));
     DB database = mongo.getDB("mydb");
     DBCollection userCollection = database.getCollection("users");  
    private String message;
     
    public void addUsers(User u)
    {
        
       
        BasicDBObject dbo = new BasicDBObject();
        dbo.append("firstname", u.getFirstname());
        dbo.append("lastname", u.getLastname());
        dbo.append("email", u.getEmail());
        dbo.append("password", u.getPassword());
       // dbo.append("lastname", u.);
        userCollection.insert(dbo);
        mongo.close();
        
    }
    
      public boolean checkUser(User u)
    {
         boolean[] b = new boolean[1];
         
       
    for (DBObject obj : userCollection.find()) {
        
            String email = (String) obj.get("email");
            String password = (String) obj.get("password");
            
            System.out.println(email + " " + password);
            
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

    public void setMessage(String msg) {
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }
}
