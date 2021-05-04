package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ProductDao;
import com.db.DbConnect;

/**
 * Servlet implementation class ProductDetail
 */
@WebServlet("/EditProductDetail")
public class EditProductDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		String description = request.getParameter("description");
		String category = request.getParameter("category");
		String status = request.getParameter("status");
		ProductDao productdao = new ProductDao(DbConnect.getCon());
		boolean flag = productdao.updateProduct(name, price, description, category, status);
		if (flag) {
			session.setAttribute("msg", "Successfully added the product...");
			response.sendRedirect("admin/editProduct.jsp?id=" + id);
		} else {
			session.setAttribute("msg", "Failed to add the product, please try again...");
			response.sendRedirect("admin/editProduct.jsp?id=" + id);
		}

	}

}
