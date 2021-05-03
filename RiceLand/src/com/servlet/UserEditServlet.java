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
import com.detail.User;

/**
 * Servlet implementation class UserEditServlet
 */
@WebServlet("/UserEditServlet")
public class UserEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String number = request.getParameter("number");
		String address = request.getParameter("address");
		String state = request.getParameter("state");
		String city = request.getParameter("city");
		int zip = Integer.parseInt(request.getParameter("zip"));
		
		user.setFname(fname);
		user.setLname(lname);
		user.setEmail(email);
		user.setNumber(number);
		user.setAddress(address);
		user.setState(state);
		user.setCity(city);
		user.setZip(zip);
		try {
			UserDao userdao = new UserDao(DbConnect.getCon());
			boolean flag = userdao.editDetails(user);
			if (flag) {
				session.setAttribute("success", "Your details have been changed successfully...");
				session.setAttribute("user", user);
				response.sendRedirect("profile.jsp");
			} else {
				session.setAttribute("error", "Something went wrong please try again...");
				response.sendRedirect("pageNotFound.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}