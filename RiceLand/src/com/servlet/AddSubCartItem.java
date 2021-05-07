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
 * Servlet implementation class AddSubCartItem
 */
@WebServlet("/AddSubCartItem")
public class AddSubCartItem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		boolean flag = false;
		int uid = Integer.parseInt(request.getParameter("uid"));
		int pid = Integer.parseInt(request.getParameter("pid"));
		int prc = Integer.parseInt(request.getParameter("prc"));
		HttpSession session = request.getSession();
		if ("add".equals(request.getParameter("msg"))) {
			CartDao cartdao = new CartDao(DbConnect.getCon());
			flag = cartdao.addQuantity(uid, pid, prc);
		} else if ("sub".equals(request.getParameter("msg"))) {
			CartDao cartdao = new CartDao(DbConnect.getCon());
			flag = cartdao.subQuantity(uid, pid, prc);
		}
		if (flag) {
			response.sendRedirect("cart.jsp");
		} else {
			session.setAttribute("msg", "Product quantity cannot be less than 0, please remove the product..");
			response.sendRedirect("cart.jsp");
		}
	}

}
