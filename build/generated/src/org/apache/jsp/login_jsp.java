package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<title>Login I Pet </title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"public/assets/css/signin.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans|Pacifico\" rel=\"stylesheet\"> \n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");

            if(session.getAttribute("NIC")!=null){
                HttpSession ses = request.getSession();
                ses.invalidate();
            }
            String change = "none";
        if(request.getQueryString()!=null){
        change = "block";
        }
        
      out.write("\n");
      out.write("\t<header>\n");
      out.write("            <a href=\"index.jsp\" style=\"text-decoration: none; color: yellow\"><div>\n");
      out.write("     <i class=\"fa fa-paw\" aria-hidden=\"true\"></i>\n");
      out.write("\n");
      out.write("      <p style=\"color: blue; font-size: 16pt\">iPet</p>\n");
      out.write("                </div></a>\n");
      out.write("    <nav>\n");
      out.write("      <ul>\n");
      out.write("         <li><a href=\"allEvents.jsp\">Events</a></li>\n");
      out.write("        <li><a href=\"Shelter.jsp\">Shelter</a></li>\n");
      out.write("        <li><a href=\"register.jsp\">Sign up</a></li>\n");
      out.write("        <li><a style=\"background-color: rgba(255,255,255,0.5);color:black\" href=\"login.jsp\">Sign in</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
      out.write("        \n");
      out.write("        <div class=\"limiter\">\n");
      out.write("\t\t<div class=\"container-login100\">\n");
      out.write("\t\t\t<div class=\"wrap-login100\">\n");
      out.write("\t\t\t\t<div class=\"login100-form-title\" style=\"background-image: url(C:\\Users\\DELL\\Desktop\\Ipet\\iPET\\iPET);\">\n");
      out.write("\t\t\t\t\t<section class=\"titles\">\n");
      out.write("\n");
      out.write("    <h1>Log In</h1>\n");
      out.write("  </section>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                            <kbd  style=\"text-align: center; color:#FF0060; background-color:yellow; font-weight: bolder;  display: ");
      out.print(change);
      out.write("\">Sorry, Your username or password is incorrect</kbd>\n");
      out.write("                            <form method=\"POST\" action=\"login\" class=\"login100-form validate-form\">\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input m-b-26\" data-validate=\"Username is required\">\n");
      out.write("\t\t\t\t\t\t<span class=\"label-input100\">NIC</span>\n");
      out.write("                                                <input class=\"input100\" name=\"nic\" type=\"text\" required name=\"username\" placeholder=\"Enter username\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input m-b-18\" data-validate = \"Password is required\">\n");
      out.write("\t\t\t\t\t\t<span class=\"label-input100\">Password</span>\n");
      out.write("                                                <input class=\"input100\" name=\"pwd\" type=\"password\" required name=\"pass\" placeholder=\"Enter password\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"flex-sb-m w-full p-b-30\">\n");
      out.write("\t\t\t\t\t\t<div class=\"contact100-form-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"input-checkbox100\" id=\"ckb1\" type=\"checkbox\" name=\"remember-me\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"label-checkbox100\" for=\"ckb1\">\n");
      out.write("\t\t\t\t\t\t\t\tRemember me\n");
      out.write("\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"forget.jsp\" class=\"txt1\">\n");
      out.write("\t\t\t\t\t\t\t\tForgot Password?\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"container-login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t<button class=\"login100-form-btn\">\n");
      out.write("\t\t\t\t\t\t\tLogin\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("\t<script src=\"vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
