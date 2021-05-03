package com.servlet;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdminDao;
import com.dao.UserDao;
import com.db.DbConnect;
import com.detail.Admin;
import com.detail.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	final private static char[] hexArray = "0123456789ABCDEF".toCharArray();

	private String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		int v;
		for (int j = 0; j < bytes.length; j++) {
			v = bytes[j] & 0xFF;
			hexChars[j * 2] = hexArray[v >>> 4];
			hexChars[j * 2 + 1] = hexArray[v & 0x0F];
		}
		return new String(hexChars);
	}

	// Change this to something else.
	private static String SALT = "123456";

	// A password hashing method.
	private String hashPassword(String in) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(SALT.getBytes()); // <-- Prepend SALT.
			md.update(in.getBytes());
			// md.update(SALT.getBytes()); // <-- Or, append SALT.

			byte[] out = md.digest();
			return bytesToHex(out); // <-- Return the Hex Hash.
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session = request.getSession(true);
		String email = request.getParameter("email");
		String pass = hashPassword(request.getParameter("pass"));
		AdminDao admindao = new AdminDao(DbConnect.getCon());
		Admin admin = admindao.checkadmin(email, pass);
		if (admin != null) {
			session.setMaxInactiveInterval(60 * 60);
			session.setAttribute("admin", admin);
			response.sendRedirect("./admin/admin.jsp");
		} else {
			UserDao userdao = new UserDao(DbConnect.getCon());
			User user = userdao.checkDetail(email, pass);
			if (user != null) {
				session.setMaxInactiveInterval(60 * 60);
				session.setAttribute("user", user);
				response.sendRedirect("index.jsp");
			} else {
				session.setAttribute("error", "Please login with right credentials...");
				response.sendRedirect("login.jsp");
			}
		}
	}

}
