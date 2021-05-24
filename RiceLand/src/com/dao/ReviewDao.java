package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.detail.Review;

public class ReviewDao {
	private Connection con;

	// A Connection is the session between java application and database. The
	// Connection interface is a factory of Statement, PreparedStatement i.e. object
	// of Connection can be used to get the object of Statement.

	public ReviewDao(Connection con) {
		super();
		this.con = con;
	}

	// PreparedStatement
	// The PreparedStatement interface is a subinterface of Statement. It is used to
	// execute parameterized query.

	// As you can see, we are passing parameter (?) for the values. Its value will
	// be set by calling the setter methods of PreparedStatement.

	// Improves performance: The performance of the application will be faster if
	// you use PreparedStatement interface because query is compiled only once.

	// ResultSet
	// The object of ResultSet maintains a cursor pointing to a row of a table.
	// Initially, cursor points to before the first row.

	
	// addReview(int, int, String, int) will add the review of the current user.
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

	// getReview(int id) will return the list of the reviews of all the user of the particular product.
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
