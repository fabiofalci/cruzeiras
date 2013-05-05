package views.publishing;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class picture_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"well\" style=\"max-width: 400px; margin: 0 auto 10px;\">\n\t<form id=\"file-input-form\" action=\"/pictureupload\" enctype=\"multipart/form-data\" method=\"post\">\n\t\t<input id=\"file-input\" type=\"file\" name=\"datafile\" size=\"40\" style=\"display:none\">\n\t    <button id=\"upload-button\" type=\"button\" class=\"btn btn-large btn-block btn-success\">Upload</button>\n\t</form>\n</div>\n\n<script type=\"text/javascript\">\n\t$(document).ready(function() {\n\t\t$(\"#upload-button\").click(function() {\n\t\t\t$(\"#file-input\").click()\n\t\t})\n\t\t$(\"#file-input\").change(function() {\n\t\t\t$(\"#file-input-form\").submit()\t\t\n\t\t})\n\t})\n</script>\n");
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
