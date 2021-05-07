package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.OrderDao;
import com.db.DbConnect;

/**
 * Servlet implementation class CompletedOrder
 */
@WebServlet("/CompletedOrder")
public class CompletedOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id = Integer.parseInt(request.getParameter("id"));
		OrderDao orderdao = new OrderDao(DbConnect.getCon());
		boolean flag = orderdao.completedOrder(id, "completed");
		HttpSession session = request.getSession();
		if (flag) {
			session.setAttribute("msg", "Order Completed..");
			response.sendRedirect("admin/showOrders.jsp?id=" + id);
		} else {
			session.setAttribute("msg", "Something went wrong..");
			response.sendRedirect("admin/showOrders.jsp?id=" + id);
		}

	}

}
