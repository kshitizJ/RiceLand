package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDao;
import com.db.DbConnect;

/**
 * Servlet implementation class DeleteUser
 */
@WebServlet("/DeleteUser")
public class DeleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		UserDao userdao = new UserDao(DbConnect.getCon());
		boolean flag = userdao.deleteUser(id);
		HttpSession session = request.getSession();
		if (flag) {
			session.setAttribute("msg", "User deleted successfully...");
			response.sendRedirect("admin/showUsers.jsp");
		} else {
			session.setAttribute("msg", "Failed to delete a user, please try again...");
			response.sendRedirect("admin/showUsers.jsp");
		}
	}

}
