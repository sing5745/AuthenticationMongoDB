<%-- 
    Document   : index
    Created on : 22-Mar-2018, 4:35:47 PM
    Author     : Inder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        
        <meta charset="UTF-8">
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            html{
                font-family: "Agency FB";
                
            }
           
            .card {
                box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
                transition: 0.1s;
                width: 40%;
                margin: auto;
                background-color: white;
            }
            .center{
                margin-top: 50px;
               margin-left: 140px;
            }
            
            h1{
                text-align: center;
            }
            
            span{
                font-size: 20pt;
            }
            
            button{
                margin-top: 20px;
                margin-left: 90px;
            }
            table{
                font-size: 20pt;
            }
        </style>
    </head>
    <body>
        <h1>User Registeration</h1>
        
        <div class="card">
            <h1 style="color: red;">${message}</h1>
            <div class="center">
                <form action="uReg">
                    <table>
                        <tr>
                            <td>Enter your first name: </td>
                            <td><input type="text" name="fName"></td>
                        </tr>
                        <tr>
                            <td>Enter your last name: </td>
                            <td><input type="text" name="lName"></td>
                        </tr>
                        
                        <tr>
                            <td>Enter your E-mail: </td>
                            <td><input type="email" name="email"></td>
                        </tr>
                        <tr>
                            <td> Enter your password: </td>
                            <td><input type="password" id="password" name="pass" onkeyup="check();"></td>
                        </tr>
                        <tr>
                            <td> Confirm password: </td>
                            <td><input type="password" id="confirm_password" onkeyup="check();"> <span id="message"></span></td>
                        </tr>
                        <tr>
                            <td><button type="submit">Submit</button></td>
                        </tr>
                        
                   </table>
                </form>
            </div>
        </div>
    </body>
    <script>
          var check = function() {
          if (document.getElementById('password').value ==
            document.getElementById('confirm_password').value) {
            document.getElementById('message').style.color = 'green';
            document.getElementById('message').innerHTML = '<i class="fa fa-check-circle" aria-hidden="true"></i>';
          } else {
            document.getElementById('message').style.color = 'red';
            document.getElementById('message').innerHTML = '<i class="fa fa-check-circle" aria-hidden="true"></i>';
          }
        }
    </script>
</html>
