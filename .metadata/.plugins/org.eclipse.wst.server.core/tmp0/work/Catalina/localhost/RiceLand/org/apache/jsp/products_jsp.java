/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2021-05-04 15:20:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.detail.User;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/./all_components/common.jsp", Long.valueOf(1619984311111L));
    _jspx_dependants.put("/./all_components/navbar.jsp", Long.valueOf(1619990074176L));
    _jspx_dependants.put("/./all_components/footer.jsp", Long.valueOf(1619985418193L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.detail.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');

	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
User user1 = (User) session.getAttribute("user");
if (user1 == null) {
	response.sendRedirect("login.jsp");
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\"\n");
      out.write("\thref=\"./assets/images/logo/logo.svg\" />\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("<link\n");
      out.write("\thref=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600;700&display=swap\"\n");
      out.write("\trel=\"stylesheet\">\n");
      out.write("<!--Font awesome icon-->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\"\n");
      out.write("\tintegrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\"\n");
      out.write("\tcrossorigin=\"anonymous\" />\n");
      out.write("<!--Bootstrap link-->\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\"\n");
      out.write("\tintegrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\"\n");
      out.write("\tcrossorigin=\"anonymous\">\n");
      out.write("<link rel=\"stylesheet\" href=\"./assets/css/style.css\">\n");
      out.write("\n");
      out.write("<!-- Bootstrap scripts -->\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\n");
      out.write("\tintegrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"\n");
      out.write("\tintegrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js\"\n");
      out.write("\tintegrity=\"sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF\"\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<script src=\"./assets/js/smooth-scroll.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tvar scroll = new SmoothScroll('a[href*=\"#\"]');\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<title>Products</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light fixed-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"index.jsp#page-top\"><img\n");
      out.write("\t\t\tsrc=\"./assets/images/logo/logo.svg\" width=\"125px\"></a>\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("\t\t\tdata-target=\"#navbarNavAltMarkup\" aria-controls=\"navbarNavAltMarkup\"\n");
      out.write("\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("\t\t</button>\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\n");
      out.write("\t\t\t<div class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t<a class=\"nav-item nav-link\" href=\"index.jsp#page-top\"><i\n");
      out.write("\t\t\t\t\tclass=\"fas fa-home\"></i> Home</a> <a class=\"nav-item nav-link\"\n");
      out.write("\t\t\t\t\thref=\"index.jsp#about\"><i class=\"fas fa-info-circle\"></i> About\n");
      out.write("\t\t\t\t\tWebsite</a>\n");
      out.write("\t\t\t\t");

					response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
				User user = (User) session.getAttribute("user");
				if (user != null) {
				
      out.write("\n");
      out.write("\t\t\t\t<a class=\"nav-item nav-link\" href=\"products.jsp\"><i\n");
      out.write("\t\t\t\t\tclass=\"fas fa-tags\"></i> Products</a>\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\"\n");
      out.write("\t\t\t\t\tid=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\"\n");
      out.write("\t\t\t\t\taria-haspopup=\"true\" aria-expanded=\"false\"> <i\n");
      out.write("\t\t\t\t\t\tclass=\"fas fa-id-badge\"></i> ");
      out.print(user.getFname() + " " + user.getLname());
      out.write("\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"profile.jsp\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-user\"></i> Profile</a> <a class=\"dropdown-item\"\n");
      out.write("\t\t\t\t\t\t\thref=\"cart.jsp\"><i class=\"fas fa-cart-plus\"></i> My Cart</a> <a\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"orders.jsp\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sort-size-up-alt\"></i> My Orders</a> <a\n");
      out.write("\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"LogoutServlet\"><i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fas fa-sign-out-alt\"></i> Log Out</a>\n");
      out.write("\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t");

					}
				if (user == null) {
				
      out.write("\n");
      out.write("\t\t\t\t<a class=\"nav-item nav-link\" href=\"login.jsp\"><i\n");
      out.write("\t\t\t\t\tclass=\"fas fa-user\"></i> Account</a>\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\n");
      out.write("\t\t\t\t<a class=\"nav-item nav-link\" href=\"#contact\"><i\n");
      out.write("\t\t\t\t\tclass=\"fas fa-file-signature\"></i> Contact</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("\t<section id=\"FeatureProduct\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row d-flex justify-content-center align-items-center\">\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-12\">\n");
      out.write("\t\t\t\t\t<h2 class=\"title\">Featured products</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6 col-12 form-group\">\n");
      out.write("\t\t\t\t\t<select class=\"form-control\" id=\"exampleFormControlSelect1\">\n");
      out.write("\t\t\t\t\t\t<option>Default Sorting</option>\n");
      out.write("\t\t\t\t\t\t<option>Sort by price</option>\n");
      out.write("\t\t\t\t\t\t<option>Sort by rating</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row d-flex justify-content-center align-items-center\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-mg-6 col-12 text-center\">\n");
      out.write("\t\t\t\t\t<img class=\"img-fluid\" src=\"./assets/images/rice/basmati.jpeg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 375px; height: 350px; border-radius: 5px;\"> <a\n");
      out.write("\t\t\t\t\t\tclass=\"stretched-link\" href=\"productdetail.jsp?id=1\">\n");
      out.write("\t\t\t\t\t\t<h4>Basmati Rice</h4>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p>Rs.170/Kg</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-mg-6 col-12 text-center\">\n");
      out.write("\t\t\t\t\t<img class=\"img-fluid\" src=\"./assets/images/rice/brown.jpeg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 375px; height: 350px; border-radius: 5px;\"> <a\n");
      out.write("\t\t\t\t\t\tclass=\"stretched-link\" href=\"productdetail.jsp\">\n");
      out.write("\t\t\t\t\t\t<h4>Brown Rice</h4>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p>Rs.110/Kg</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-mg-6 col-12 text-center\">\n");
      out.write("\t\t\t\t\t<img class=\"img-fluid\" src=\"./assets/images/rice/matta.jpeg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 375px; height: 350px; border-radius: 5px;\"> <a\n");
      out.write("\t\t\t\t\t\tclass=\"stretched-link\" href=\"productdetail.jsp\">\n");
      out.write("\t\t\t\t\t\t<h4>Matta Rice</h4>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p>Rs.450/Kg</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-mg-6 col-12 text-center\">\n");
      out.write("\t\t\t\t\t<img class=\"img-fluid\" src=\"./assets/images/rice/red.jpeg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 375px; height: 350px; border-radius: 5px;\"> <a\n");
      out.write("\t\t\t\t\t\tclass=\"stretched-link\" href=\"productdetail.jsp\">\n");
      out.write("\t\t\t\t\t\t<h4>Red Rice</h4>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i> <i class=\"fa fa-star-half-o\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p>Rs.580/Kg</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-mg-6 col-12 text-center\">\n");
      out.write("\t\t\t\t\t<img class=\"img-fluid\" src=\"./assets/images/rice/jasmine.jpeg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 375px; height: 350px; border-radius: 5px;\"> <a\n");
      out.write("\t\t\t\t\t\tclass=\"stretched-link\" href=\"productdetail.jsp\">\n");
      out.write("\t\t\t\t\t\t<h4>Jasmine Rice</h4>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i> <i class=\"fa fa-star-half-o\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p>Rs.350/Kg</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-mg-6 col-12 text-center\">\n");
      out.write("\t\t\t\t\t<img class=\"img-fluid\" src=\"./assets/images/rice/parboiled.jpeg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 375px; height: 350px; border-radius: 5px;\"> <a\n");
      out.write("\t\t\t\t\t\tclass=\"stretched-link\" href=\"productdetail.jsp\">\n");
      out.write("\t\t\t\t\t\t<h4>Parboiled Rice</h4>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p>Rs.113/Kg</p>\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-mg-6 col-12 text-center\">\n");
      out.write("\t\t\t\t\t<img class=\"img-fluid\" src=\"./assets/images/rice/arborio.jpeg\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 375px; height: 350px; border-radius: 5px;\"> <a\n");
      out.write("\t\t\t\t\t\tclass=\"stretched-link\" href=\"productdetail.jsp\">\n");
      out.write("\t\t\t\t\t\t<h4>Arborio Rice</h4>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p>Rs.580/Kg</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-------------- end of featured products -------------->\n");
      out.write("\t<!-- Latest Product -->\n");
      out.write("\t<section id=\"LatestProduct\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2 class=\"title\">Latest products</h2>\n");
      out.write("\t\t\t<div class=\"row d-flex justify-content-center align-items-center\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 text-center\">\n");
      out.write("\t\t\t\t\t<img class=\"img-fluid\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 300px; height: 250px; border-radius: 5px;\"\n");
      out.write("\t\t\t\t\t\tsrc=\"./assets/images/rice/wild%20rice.jpg\"> <a\n");
      out.write("\t\t\t\t\t\tclass=\"stretched-link\" href=\"productdetail.jsp\"></a>\n");
      out.write("\t\t\t\t\t<h4>Wild Rice</h4>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p>Rs.200/Kg</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 text-center\">\n");
      out.write("\t\t\t\t\t<img class=\"img-fluid\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 300px; height: 250px; border-radius: 5px;\"\n");
      out.write("\t\t\t\t\t\tsrc=\"./assets/images/rice/valencia%201.jpg\"> <a\n");
      out.write("\t\t\t\t\t\tclass=\"stretched-link\" href=\"productdetail.jsp\">\n");
      out.write("\t\t\t\t\t\t<h4>Valencia Rice</h4>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p>Rs.300/Kg</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 text-center\">\n");
      out.write("\t\t\t\t\t<img class=\"img-fluid\"\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 300px; height: 250px; border-radius: 5px;\"\n");
      out.write("\t\t\t\t\t\tsrc=\"./assets/images/rice/black.jpg\"><a\n");
      out.write("\t\t\t\t\t\tclass=\"stretched-link\" href=\"productdetail.jsp\">\n");
      out.write("\t\t\t\t\t\t<h4>Black Rice</h4>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star\"></i> <i class=\"fa fa-star\"></i> <i\n");
      out.write("\t\t\t\t\t\t\tclass=\"fa fa-star-o\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p>Rs.325/Kg</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- End of Latest Product -->\n");
      out.write("\t");
      out.write("<!-- Contact Us -->\n");
      out.write("<section class=\"footer\" id=\"contact\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h2 class=\"title\">Contact Us</h2>\n");
      out.write("\t\t<div class=\"row d-flex justify-content-center align-items-center\">\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-12 text-center\">\n");
      out.write("\t\t\t\t<img src=\"./assets/images/logo/logo.svg\">\n");
      out.write("\t\t\t\t<p>Our Purpose Is To Sustainably Make The Pleasure And Benefits\n");
      out.write("\t\t\t\t\tOf Rice Accesible To Many</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-12 text-center\">\n");
      out.write("\t\t\t\t<h3>Useful links</h3>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><i class=\"fas fa-tags\"></i> Coupons</li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fab fa-blogger\"></i> Blog Post</li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fas fa-exchange-alt\"></i> Return Policy</li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fas fa-sign-in-alt\"></i> Join Affiliate</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-12 text-center\">\n");
      out.write("\t\t\t\t<h3>Follow Us</h3>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><i class=\"fab fa-facebook-square\"></i> Facebook</li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fab fa-twitter-square\"></i> Twitter</li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fab fa-instagram\"></i> Instagram</li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fab fa-youtube-square\"></i> Youtube</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<p class=\"copyright\">\n");
      out.write("\t\t\t<i class=\"fas fa-copyright\"></i> Copyright 2021\n");
      out.write("\t\t</p>\n");
      out.write("\t</div>\n");
      out.write("</section>\n");
      out.write("<!-- End of Contact Us -->");
      out.write("s\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script src=\"./assets/js/smooth-scroll.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tvar scroll = new SmoothScroll('a[href*=\"#\"]');\n");
      out.write("</script>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
