package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            html{\n");
      out.write("                font-family: \"Agency FB\";\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            .card {\n");
      out.write("                box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);\n");
      out.write("                transition: 0.1s;\n");
      out.write("                width: 40%;\n");
      out.write("                margin: auto;\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("            .center{\n");
      out.write("                margin-top: 50px;\n");
      out.write("               margin-left: 140px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h1{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            span{\n");
      out.write("                font-size: 20pt;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            button{\n");
      out.write("                margin-top: 20px;\n");
      out.write("                margin-left: 90px;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                font-size: 20pt;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>User Registeration</h1>\n");
      out.write("        \n");
      out.write("        <div class=\"card\">\n");
      out.write("            <h1 style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("            <div class=\"center\">\n");
      out.write("                <form action=\"uReg\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Enter your first name: </td>\n");
      out.write("                            <td><input type=\"text\" name=\"fName\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Enter your last name: </td>\n");
      out.write("                            <td><input type=\"text\" name=\"lName\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td>Enter your E-mail: </td>\n");
      out.write("                            <td><input type=\"email\" name=\"email\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td> Enter your password: </td>\n");
      out.write("                            <td><input type=\"password\" id=\"password\" name=\"pass\" onkeyup=\"check();\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td> Confirm password: </td>\n");
      out.write("                            <td><input type=\"password\" id=\"confirm_password\" onkeyup=\"check();\"> <span id=\"message\"></span></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><button type=\"submit\">Submit</button></td>\n");
      out.write("                            <td><a href=\"login.jsp\">Already User</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                   </table>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("          var check = function() {\n");
      out.write("          if (document.getElementById('password').value ==\n");
      out.write("            document.getElementById('confirm_password').value) {\n");
      out.write("            document.getElementById('message').style.color = 'green';\n");
      out.write("            document.getElementById('message').innerHTML = '<i class=\"fa fa-check-circle\" aria-hidden=\"true\"></i>';\n");
      out.write("          } else {\n");
      out.write("            document.getElementById('message').style.color = 'red';\n");
      out.write("            document.getElementById('message').innerHTML = '<i class=\"fa fa-check-circle\" aria-hidden=\"true\"></i>';\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
