package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.detail.Review;

public class ReviewDao {
	private Connection con;

	public ReviewDao(Connection con) {
		super();
		this.con = con;
	}

	public boolean addReview(int uid, int pid, String review, int star) {
		boolean flag = false;
		try {
			String query = "insert into review(user_id, product_id, review, star) value (?,?,?,?) ;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, uid);
			ps.setInt(2, pid);
			ps.setString(3, review);
			ps.setInt(4, star);
			int i = ps.executeUpdate();
			if (i == 1)
				flag = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return flag;
	}

	public List<Review> getReview(int id) {
		List<Review> reviews = new ArrayList<Review>();
		Review review;
		try {
			String query = "select * from review where product_id = ? ;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				review = new Review(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5));
				reviews.add(review);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return reviews;
	}
}
