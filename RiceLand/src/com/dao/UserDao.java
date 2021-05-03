package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.detail.User;

public class UserDao {
	Connection con;

	public UserDao(Connection con) {
		super();
		this.con = con;
	}

	public boolean adduser(User user) {
		boolean flag = false;
		try {
			String query = "insert into user(fname, lname, email, password, mobile_no, address, state, city, zip) values(?,?,?,?,?,?,?,?,?);";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getFname());
			ps.setString(2, user.getLname());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getPass());
			ps.setString(5, user.getNumber());
			ps.setString(6, user.getAddress());
			ps.setString(7, user.getState());
			ps.setString(8, user.getCity());
			ps.setInt(9, user.getZip());
			int i = ps.executeUpdate();
			if (i == 1)
				flag = true;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return flag;
	}

	public User checkDetail(String email, String pass) {
		User user = null;
		
		try {
			String query = "select * from user where email = ? and password = ? ;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user = new User(rs.getInt("user_id"), rs.getString("fname"), rs.getString("lname"),
						rs.getString("email"), rs.getString("password"), rs.getString("mobile_no"),
						rs.getString("address"), rs.getString("state"), rs.getString("city"), rs.getInt("zip"),
						rs.getDate("date_registered"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return user;
	}

	public boolean editDetails(User user) {
		boolean flag = false;
		try {
			String query = "update user set fname = ?, lname = ?, email = ?, mobile_no = ?, address = ?, state = ?, city = ?, zip = ? where user_id = ? ;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getFname());
			ps.setString(2, user.getLname());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getNumber());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getState());
			ps.setString(7, user.getCity());
			ps.setInt(8, user.getZip());
			ps.setInt(9, user.getId());
			int i = ps.executeUpdate();
			//System.out.println(i);
			if (i == 1)
				flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return flag;
	}

}