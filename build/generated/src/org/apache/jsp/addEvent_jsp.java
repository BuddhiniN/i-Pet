package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addEvent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>iPet Event</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">\n");
      out.write("    <link href=\"public/assets/css/addevent.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("\n");
      out.write("/* The Modal (background) */\n");
      out.write(".modal {\n");
      out.write("  display: none; /* Hidden by default */\n");
      out.write("  position: fixed; /* Stay in place */\n");
      out.write("  z-index: 1; /* Sit on top */\n");
      out.write("  padding-top: 100px; /* Location of the box */\n");
      out.write("  left: 0;\n");
      out.write("  top: 0;\n");
      out.write("  width: 100%; /* Full width */\n");
      out.write("  height: 100%; /* Full height */\n");
      out.write("  overflow: auto; /* Enable scroll if needed */\n");
      out.write("  background-color: rgb(0,0,0); /* Fallback color */\n");
      out.write("  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Modal Content */\n");
      out.write(".modal-content {\n");
      out.write("  background-color: #fefefe;\n");
      out.write("  margin: auto;\n");
      out.write("  padding: 20px;\n");
      out.write("  border: 1px solid #888;\n");
      out.write("  width: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The Close Button */\n");
      out.write(".close {\n");
      out.write("  color: #aaaaaa;\n");
      out.write("  float: right;\n");
      out.write("  font-size: 28px;\n");
      out.write("  font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".close:hover,\n");
      out.write(".close:focus {\n");
      out.write("  color: #000;\n");
      out.write("  text-decoration: none;\n");
      out.write("  cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    #map {\n");
      out.write("        height: 100%;\n");
      out.write("      }\n");
      out.write("      /* Optional: Makes the sample page fill the window. */\n");
      out.write("      html, body {\n");
      out.write("        height: 100%;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("      }\n");
      out.write("      #floating-panel {\n");
      out.write("        position: absolute;\n");
      out.write("        top: 10px;\n");
      out.write("        left: 25%;\n");
      out.write("        z-index: 5;\n");
      out.write("        background-color: #fff;\n");
      out.write("        padding: 5px;\n");
      out.write("        border: 1px solid #999;\n");
      out.write("        text-align: center;\n");
      out.write("        font-family: 'Roboto','sans-serif';\n");
      out.write("        line-height: 30px;\n");
      out.write("        padding-left: 10px;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"main\">\n");
  String display = "block";
    String pic = "none";
    if(request.getQueryString()!= null){
        display = "none";
        pic = "block";
    }

      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div style=\"display: ");
      out.print(display);
      out.write("\">\n");
      out.write("                <button onclick=\"window.location.href='admin.jsp'\"  class=\"btn-danger mt-2\" >X</button>\n");
      out.write("                \n");
      out.write("            <form method=\"POST\" class=\"appointment-form\" action=\"createEvent\" id=\"appointment-form\">\n");
      out.write("                <h2>Event Registration Form</h2>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group-1\">\n");
      out.write("                    <label for=\"title\" style=\"color: #222; font-weight: bold\">Event Title</label>\n");
      out.write("                    <input type=\"text\" name=\"title\" id=\"title\" required />\n");
      out.write("                    <label for=\"date\" style=\"color: #222; font-weight: bold\">Event Due Date</label>\n");
      out.write("                    <input type=\"date\" name=\"date\" id=\"date\"  required />\n");
      out.write("                    <label for=\"time\" style=\"color: #222; font-weight: bold\">Event Due Time</label>\n");
      out.write("                    <input type=\"time\" name=\"time\" id=\"time\" placeholder=\"Time\" required />\n");
      out.write("                    <label for=\"place\" style=\"color: #222; font-weight: bold\">Event Venue</label>\n");
      out.write("                    <input type=\"text\" name=\"place\" id=\"place\"  required />\n");
      out.write("                    <label for=\"type\" style=\"color: #222; font-weight: bold\">Event Type</label>\n");
      out.write("                    <input type=\"text\" name=\"type\" id=\"type\" required />\n");
      out.write("                    <label for=\"desc\" style=\"color: #222; font-weight: bold\">Event Description</label>\n");
      out.write("                    <input type=\"text\" name=\"desc\" id=\"desc\" required />\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-submit\">\n");
      out.write("                    \n");
      out.write("                    <input type=\"reset\" value=\"Reset\" class=\"btn btn-danger\">\n");
      out.write("                   \n");
      out.write("                    <center><input type=\"submit\" name=\"submit\" id=\"submit\" class=\"btn-lg btn-success\" value=\"Create an Event\" /></center>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("                <!--Image-->\n");
      out.write("                <div style=\"display:");
      out.print(pic);
      out.write(" ; padding:3rem;\">\n");
      out.write("                    <form action=\"imageEvent\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <label for=\"file\" style=\"color: #222; font-weight: bold\">Include Event Image</label>\n");
      out.write("                    <input type=\"file\" required accept=\"image/png, image/jpeg\" name=\"file\" size=\"50\" />\n");
      out.write("                    <div class=\"form-submit\">\n");
      out.write("                    <input type=\"submit\" name=\"submit\" id=\"submit\" class=\"submit\" value=\"Include Image\" />\n");
      out.write("                    <kbd style=\"background-color: orangered; padding: 5px;\"><a style=\"text-decoration: none; color:white;\" href=\"admin.jsp\">Skip</a></kbd>\n");
      out.write("                </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                    <div id=\"myModal\" class=\"modal\">\n");
      out.write("\n");
      out.write("  <!-- Modal content -->\n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("    <span class=\"close\">&times;</span>\n");
      out.write("    <h4 style=\"margin-top: 3%; margin-bottom: 6%;\">Choose Location</h4>\n");
      out.write(" <div id=\"map\"></div>\n");
      out.write("    <p>Click on the map to add markers.</p>\n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("      // In the following example, markers appear when the user clicks on the map.\n");
      out.write("      // The markers are stored in an array.\n");
      out.write("      // The user can then click an option to hide, show or delete the markers.\n");
      out.write("      var map;\n");
      out.write("      var markers = [];\n");
      out.write("\n");
      out.write("      function initMap() {\n");
      out.write("        var haightAshbury = {lat: 7.8731, lng: 80.7718};\n");
      out.write("\n");
      out.write("        map = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("          zoom: 8,\n");
      out.write("          center: haightAshbury,\n");
      out.write("          mapTypeId: 'terrain'\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // This event listener will call addMarker() when the map is clicked.\n");
      out.write("        map.addListener('click', function(event) {\n");
      out.write("          addMarker(event.latLng);\n");
      out.write("          alert(\"lat:\"+event.latLng.lat().toString())\n");
      out.write("          alert(\"lng:\"+event.latLng.lng().toString())\n");
      out.write("          var late=event.latLng.lat().toString();\n");
      out.write("          var lange=event.latLng.lng().toString();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // Adds a marker at the center of the map.\n");
      out.write("        addMarker(haightAshbury);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      // Adds a marker to the map and push to the array.\n");
      out.write("      function addMarker(location) {\n");
      out.write("        deleteMarkers()\n");
      out.write("        var marker = new google.maps.Marker({\n");
      out.write("          position: location,\n");
      out.write("          map: map\n");
      out.write("        });\n");
      out.write("        markers.push(marker);\n");
      out.write("        \n");
      out.write("      }\n");
      out.write("\n");
      out.write("      // Sets the map on all markers in the array.\n");
      out.write("      function setMapOnAll(map) {\n");
      out.write("        for (var i = 0; i < markers.length; i++) {\n");
      out.write("          markers[i].setMap(map);\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      // Removes the markers from the map, but keeps them in the array.\n");
      out.write("      function clearMarkers() {\n");
      out.write("        setMapOnAll(null);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      // Shows any markers currently in the array.\n");
      out.write("      function showMarkers() {\n");
      out.write("        setMapOnAll(map);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      // Deletes all markers in the array by removing references to them.\n");
      out.write("      function deleteMarkers() {\n");
      out.write("        clearMarkers();\n");
      out.write("        markers = [];\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("    <script async defer\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyDXtDJjjD6gu3XYrzWn7uLB8TaIKvkevQk&callback=initMap\">\n");
      out.write("    </script>\n");
      out.write("    </div></div>\n");
      out.write("    \n");
      out.write("<!--\n");
      out.write("<script>\n");
      out.write("// Get the modal\n");
      out.write("var modal = document.getElementById(\"myModal\");\n");
      out.write("\n");
      out.write("// Get the button that opens the modal\n");
      out.write("var btn = document.getElementById(\"myBtn\");\n");
      out.write("\n");
      out.write("// Get the <span> element that closes the modal\n");
      out.write("var span = document.getElementsByClassName(\"close\")[0];\n");
      out.write("\n");
      out.write("// When the user clicks the button, open the modal \n");
      out.write("btn.onclick = function() {\n");
      out.write("  modal.style.display = \"block\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks on <span> (x), close the modal\n");
      out.write("span.onclick = function() {\n");
      out.write("  modal.style.display = \"none\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("  if (event.target == modal) {\n");
      out.write("    modal.style.display = \"none\";\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>-->\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
