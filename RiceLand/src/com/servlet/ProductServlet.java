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
import com.detail.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String name = request.getParameter("name");
		String path = request.getParameter("img");
		int price = Integer.parseInt(request.getParameter("price"));
		int star = 0;
		String description = request.getParameter("description");
		String category = request.getParameter("category");
		String status = request.getParameter("status");

		System.out.println(path);

		Product product = new Product(name, path, price, star, description, category, status);
		ProductDao productdao = new ProductDao(DbConnect.getCon());
		boolean flag = productdao.insertProduct(product);
		HttpSession session = request.getSession();
		if (flag) {
			session.setAttribute("msg", "Successfully added the product...");
			response.sendRedirect("admin/addProduct.jsp");
		} else {
			session.setAttribute("msg", "Failed to add the product, please try again...");
			response.sendRedirect("admin/addProduct.jsp");
		}
	}

}
