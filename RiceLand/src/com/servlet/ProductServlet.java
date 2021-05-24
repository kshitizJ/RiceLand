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

		// We get the following parameters from the jsp page.
		String name = request.getParameter("name");
		String path = request.getParameter("img");
		int price = Integer.parseInt(request.getParameter("price"));
		int star = 0;
		String description = request.getParameter("description");
		String category = request.getParameter("category");
		String status = request.getParameter("status");

		// Product class contains the detail of the particular product. Here we are
		// passing all the parameter to the constructor of the product page.
		Product product = new Product(name, path, price, star, description, category, status);

		// ProductDao contains the insert query to insert the product in the database.
		// DbConnect.getCon() is passed as a parameter to ProductDao class to connect
		// our back-end with database.
		ProductDao productdao = new ProductDao(DbConnect.getCon());

		// After inserting the product, the insertProduct(product) function returns a
		// boolean value.
		boolean flag = productdao.insertProduct(product);
		HttpSession session = request.getSession();

		// if flag is true than the product is added successfully.
		if (flag) {
			session.setAttribute("msg", "Successfully added the product...");
			response.sendRedirect("admin/addProduct.jsp");
		} else {
			// else some error has occured.
			session.setAttribute("msg", "Failed to add the product, please try again...");
			response.sendRedirect("admin/addProduct.jsp");
		}
	}

}
