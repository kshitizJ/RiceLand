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

	public boolean insertProduct(Product product) {
		boolean flag = false;
		try {
			String query = "insert into product(name, path, price, star, description, category, status) values(?, ?, ?, ?, ?, ?, ?) ;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, product.getName());
			ps.setString(2, product.getPath());
			ps.setInt(3, product.getPrice());
			ps.setInt(4, product.getStar());
			ps.setString(5, product.getDescription());
			ps.setString(6, product.getCategory());
			ps.setString(7, product.getStatus());
			int i = ps.executeUpdate();
			if (i == 1) {
				flag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return flag;
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
			String query = "select * from product where product_id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getDate(9));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return product;
	}

	public List<Product> getProductsByCategory(String category) {
		List<Product> products = new ArrayList<Product>();
		Product product;
		try {
			String query = "select * from product where category = ? and status = 'completed'";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, category);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				product = new Product();
				product.setPid(rs.getInt("product_id"));
				product.setName(rs.getString("name"));
				product.setPath(rs.getString("path"));
				product.setPrice(rs.getInt("price"));
				product.setStar(rs.getInt("star"));
				product.setDescription(rs.getString("description"));
				products.add(product);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return products;
	}

	public boolean updateProduct(int id, String name, int price, String description, String category, String status) {
		boolean flag = false;
		try {
			String query = "update product set name = ?, price = ?, description = ?, category = ?, status = ? where product_id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, price);
			ps.setString(3, description);
			ps.setString(4, category);
			ps.setString(5, status);
			ps.setInt(6, id);
			int i = ps.executeUpdate();
			if (i == 1) {
				flag = true;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return flag;
	}

	public boolean deleteProduct(int id) {
		boolean flag = false;
		try {
			String productquery = "delete from product where product_id = ? ;";
			// String reviewquery = "delete from review where product_id = ?";
			PreparedStatement ps = con.prepareStatement(productquery);
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if (i == 1) {
				flag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return flag;
	}

	public boolean updateStar(Product product) {
		boolean flag = false;
		try {
			String query = "update product set star = ? where product_id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, product.getStar());
			ps.setInt(2, product.getPid());
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
}
