package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.If;

import com.dao.CartDao;
import com.db.DbConnect;
import com.detail.Cart;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/AddToCart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// get request parameters from the page.
		// Integer.parseInt() will convert string number "1" to int number 1.
		int pid = Integer.parseInt(request.getParameter("pid"));
		int uid = Integer.parseInt(request.getParameter("uid"));
		int quant = 1;
		int price = Integer.parseInt(request.getParameter("price"));
		int stotal = price;

		// CartDao class contains the cart related query for the cart functionality.
		CartDao cartdao = new CartDao(DbConnect.getCon());

		// We get list of Cart items from the database. Here List<Cart> is the list of
		// Cart class which contains the details of the product inside the cart.
		List<Cart> carts = cartdao.getUserCart(uid);

		// To check if the product already exist in the cart or not.
		boolean flag = true;
		for (Cart cart : carts) {
			if (cart.getPid() == pid) {
				flag = false;
				break;
			}
		}
		HttpSession session = request.getSession();
		if (flag) {

			// if product doesnot exist in the cart then we have to insert the product
			// inside the cart.
			flag = cartdao.insertProductInCart(uid, pid, quant, stotal);
			if (flag) {
				// if product was added successfully, success msg is shown.
				session.setAttribute("msg", "Product added successfully..");
				response.sendRedirect("cart.jsp");
			} else {
				// if product fails to add then error msg is shown.
				session.setAttribute("msg", "Something went wrong, please try again..");
				response.sendRedirect("cart.jsp");
			}
		} else {
			// if product already exist then msg is shown.
			session.setAttribute("msg", "Product already exist..");
			response.sendRedirect("cart.jsp");
		}

	}

}
