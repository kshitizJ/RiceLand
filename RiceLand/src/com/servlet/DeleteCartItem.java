package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CartDao;
import com.db.DbConnect;

/**
 * Servlet implementation class DeleteCartItem
 */
@WebServlet("/DeleteCartItem")
public class DeleteCartItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// Integer.parseInt() will convert string number "1" to int number 1.
		int uid = Integer.parseInt(request.getParameter("uid"));
		int pid = Integer.parseInt(request.getParameter("pid"));

		// CartDao class contains the cart related query for the cart functionality.
		// DbConnect.getCon() is passed as a parameter to CartDao class to connect our
		// back-end with database.
		CartDao cartdao = new CartDao(DbConnect.getCon());

		// deleteProductFromCart(uid, pid) deletes product from the cart once user
		// clicks on remove.
		boolean flag = cartdao.deleteProductFromCart(uid, pid);
		HttpSession session = request.getSession();
		if (flag) {
			session.setAttribute("msg", "Successfully removed the product from your cart..");
			response.sendRedirect("cart.jsp");
		} else {
			session.setAttribute("msg", "Unable to remove the product, please try again..");
			response.sendRedirect("cart.jsp");
		}

	}

}
