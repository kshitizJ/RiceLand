package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.detail.Product;

public class ProductDao {
	private Connection con;

	public ProductDao(Connection con) {
		super();
		this.con = con;
	}

	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		Product product;
		try {
			String query = "select * from product;";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				product = new Product(rs.getInt("product_id"), rs.getString("name"), rs.getString("path"),
						rs.getInt("price"), rs.getInt("star"), rs.getString("description"), rs.getString("category"),
						rs.getString("status"), rs.getDate("date_added"));
				products.add(product);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return products;
	}

	public Product getProduct(int id) {
		Product product = null;
		try {
			String query = "select * from product where id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				product = new Product();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return product;
	}
}