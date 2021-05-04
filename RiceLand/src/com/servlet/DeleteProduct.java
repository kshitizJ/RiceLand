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
 * Servlet implementation class DeleteProduct
 */
@WebServlet("/DeleteProduct")
public class DeleteProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		int id = Integer.parseInt(request.getParameter("id"));
		ProductDao productdao = new ProductDao(DbConnect.getCon());
		boolean flag = productdao.deleteProduct(id);
		if (flag) {
			session.setAttribute("msg", "Product deleted successfully...");
			response.sendRedirect("admin/showProduct.jsp");
		} else {
			session.setAttribute("msg", "Failed to delete a product, please try again...");
			response.sendRedirect("admin/showProduct.jsp");
		}
	}

}
