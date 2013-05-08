package views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
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

      out.write("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n\t<title>Cruzeiras</title>\n\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n\n\t<link href=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.min.css\" rel=\"stylesheet\" media=\"screen\">\n\n\t<style type=\"text/css\">\n      body {\n        padding-top: 40px;\n        padding-bottom: 40px;\n        background-color: #f5f5f5;\n      }\n    </style>\n</head>\n<body>\n<div class=\"container\">\n\n\t<div class=\"row\">\n\t\t<div class=\"span3\">\n\t\t\t<p class=\"text-left\">\n\t\t\t\tSpring application on top of Netty.io\n\t\t\t</p>\n\t\t\t<p>\n\t\t\t\t<a href=\"http://github.com/fabiofalci/cruzeiras\"><img alt=\"github\" src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\"></a>\n\t\t\t</p>\n\t\t</div>\n\n\t\t<div class=\"span7\">\n\t\t\t<form class=\"form-horizontal\" method=\"post\" action=\"/home\">\n\t\t\t\t<div class=\"control-group\">\n\t\t\t\t  <label class=\"control-label\" for=\"inputEmail\">Email</label>\n\t\t\t\t  <div class=\"controls\">\n\t\t\t\t    <input type=\"text\" id=\"inputEmail\" name=\"email\" placeholder=\"Email\">\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t\t<div class=\"control-group\">\n\t\t\t\t  <label class=\"control-label\" for=\"inputPassword\">Password</label>\n\t\t\t\t  <div class=\"controls\">\n\t\t\t\t    <input type=\"password\" id=\"inputPassword\" name=\"password\" placeholder=\"Password\">\n\t\t\t\t  </div>\n\t\t\t\t</div>\n\t\t\t\t<div class=\"control-group\">\n\t\t\t\t  <div class=\"controls\">\n\t\t\t\t    <button type=\"submit\" class=\"btn\">Sign in</button>\n\t\t\t\t  </div>\n\t\t\t   </div>\n\t\t\t</form>\n\t\t</div>\t\n\t</div>\n\n</div>\n\n</body>\n</html>");
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

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/blacktocat-32.png");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
