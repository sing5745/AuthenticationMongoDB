<%-- 
    Document   : login
    Created on : 23-Mar-2018, 1:49:05 PM
    Author     : Inder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
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
    <h1>Login</h1>

    <div class="card">
        <h1 style="color: red;">${message}</h1>
        <div class="center">
            <form action="uLogin" >
                <table>
                    <tr>
                        <td> Enter your email: </td>
                        <td><input type="text" name="email" onkeyup="check();"></td>
                    </tr>
                    <tr>
                        <td> Confirm password: </td>
                        <td><input name="pass" type="password" id="confirm_password" onkeyup="check();"> <span id="message"></span></td>
                    </tr>
                    <tr>
                        <td><button type="submit">Submit</button></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</body>
</html>
