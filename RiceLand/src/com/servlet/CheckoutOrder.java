package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CartDao;
import com.dao.OrderDao;
import com.dao.ProductDao;
import com.db.DbConnect;
import com.detail.Cart;
import com.detail.Product;

/**
 * Servlet implementation class PendingProduct
 */
@WebServlet("/CheckoutOrder")
public class CheckoutOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int uid = Integer.parseInt(request.getParameter("uid"));
		CartDao cartdao = new CartDao(DbConnect.getCon());
		OrderDao orderdao = new OrderDao(DbConnect.getCon());
		List<Cart> carts = cartdao.getUserCart(uid);
		boolean flag = false;
		Product product;
		ProductDao productdao = new ProductDao(DbConnect.getCon());
		HttpSession session = request.getSession();
		for (Cart cart : carts) {
			product = new Product();
			product = productdao.getProduct(cart.getPid());
			flag = orderdao.insertOrder(uid, product.getPid(), product.getName(), product.getPrice(),
					cart.getQuantity(), cart.getStotal(), "pending");
			if (flag)
				continue;
			else
				break;
		}
		if (flag) {
			for (Cart cart : carts) {
				product = new Product();
				product = productdao.getProduct(cart.getPid());
				flag = cartdao.deleteProductFromCart(uid, product.getPid());
				if (flag)
					continue;
				else
					break;
			}
			response.sendRedirect("orders.jsp");
		} else {
			session.setAttribute("msg", "Cannot checkout please try again..");
			response.sendRedirect("cart.jsp");
		}

	}

}