/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2021-05-06 06:44:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.detail.User;
import java.util.List;
import com.dao.OrderDao;
import com.db.DbConnect;
import com.dao.ProductDao;
import com.detail.Product;
import com.detail.Order;

public final class bill_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/./all_components/common.jsp", Long.valueOf(1619984311111L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.detail.Product");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.detail.User");
    _jspx_imports_classes.add("com.dao.ProductDao");
    _jspx_imports_classes.add("com.detail.Order");
    _jspx_imports_classes.add("com.dao.OrderDao");
    _jspx_imports_classes.add("com.db.DbConnect");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
User user1 = (User) session.getAttribute("user");
if (user1 != null) {

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
      out.write("<title>Invoice</title>\n");
      out.write("</head>\n");
      out.write("<body onload=\"window.print()\">\n");
      out.write("\t<section id=\"cartItems\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row d-flex justify-content-center align-items-center\">\n");
      out.write("\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t<h2 class=\"title\">Invoice</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t<h4 class=\"text-center\">\n");
      out.write("\t\t\t\t\t\tName:\n");
      out.write("\t\t\t\t\t\t");
      out.print(user1.getFname() + " " + user1.getLname());
      out.write("</h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t<h5 class=\"text-left\">Address</h5>\n");
      out.write("\t\t\t\t\t<p class=\"\">");
      out.print(user1.getAddress());
      out.write(",\n");
      out.write("\t\t\t\t\t\t");
      out.print(user1.getCity());
      out.write(",\n");
      out.write("\t\t\t\t\t\t");
      out.print(user1.getState());
      out.write(",\n");
      out.write("\t\t\t\t\t\t");
      out.print(user1.getZip());
      out.write("</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

					OrderDao orderdao = new OrderDao(DbConnect.getCon());
				List<Order> orders = orderdao.getOrder(user1.getId());
				
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-12\">\n");
      out.write("\t\t\t\t\t<table class=\"table\">\n");
      out.write("\t\t\t\t\t\t<thead class=\"thead-dark\">\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"col\">Product</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"col\">Price</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"col\">Quantity</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"col\">Subtotal</th>\n");
      out.write("\t\t\t\t\t\t\t\t<th scope=\"col\">Status</th>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t");

								Product product;
							ProductDao productdao = new ProductDao(DbConnect.getCon());
							for (Order order : orders) {
								product = new Product();
								product = productdao.getProduct(order.getPid());
								if (order.getSts().equals("pending")) {
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cart-info d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img style=\"border-radius: 5px;\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tsrc=\"./assets/images/rice/");
      out.print(product.getPath());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p>");
      out.print(product.getName());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><i class=\"fas fa-rupee-sign\"></i> ");
      out.print(order.getPrc());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"item-amount\">");
      out.print(order.getQuant());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><i class=\"fas fa-rupee-sign\"></i> ");
      out.print(order.getStotal());
      out.write("/-</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>");
      out.print(order.getSts());
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t");

								}
							}
							
      out.write("\n");
      out.write("\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t");

					int sum = 0;
				for (Order order : orders) {
					if (order.getSts().equals("pending")) {
						sum += order.getStotal();
					}
				}
				
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-12 d-flex justify-content-center\">\n");
      out.write("\t\t\t\t\t<div class=\"total-price\">\n");
      out.write("\t\t\t\t\t\t<table class=\"table table-bordered\">\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td>Total</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td><i class=\"fas fa-rupee-sign\"></i> ");
      out.print(sum);
      out.write("/-</td>\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("</body>\n");
      out.write("</html>\n");

	} else {
response.sendRedirect("login.jsp");
}

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
