package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.detail.Cart;

public class CartDao {
	private Connection con;

	public CartDao(Connection con) {
		super();
		this.con = con;
	}

	public boolean insertProductInCart(int uid, int pid, int quant, int subtotal) {
		boolean flag = false;
		try {
			String query = "insert into cart(user_id, product_id, quantity, subtotal) values (?,?,?,?) ;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, uid);
			ps.setInt(2, pid);
			ps.setInt(3, quant);
			ps.setInt(4, subtotal);
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

	public List<Cart> getUserCart(int uid) {
		List<Cart> carts = new ArrayList<Cart>();
		Cart cart;
		try {
			String query = "select * from cart where user_id = ? ;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				cart = new Cart(rs.getInt("cart_id"), rs.getInt("user_id"), rs.getInt("product_id"),
						rs.getInt("quantity"), rs.getInt("subtotal"));
				carts.add(cart);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		return carts;
	}

	public boolean addQuantity(int uid, int pid, int prc) {
		boolean flag = false;
		try {
			int quantity = 0, stotal;
			String query1 = "select * from cart where user_id = ? and product_id = ? ;";
			String query2 = "update cart set quantity = ?, subtotal = ? where user_id = ? and product_id = ? ;";
			PreparedStatement ps = con.prepareStatement(query1);
			ps.setInt(1, uid);
			ps.setInt(2, pid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				quantity = rs.getInt("quantity");
				stotal = rs.getInt("subtotal");
			}
			quantity++;
			stotal = prc * quantity;
			ps = con.prepareStatement(query2);
			ps.setInt(1, quantity);
			ps.setInt(2, stotal);
			ps.setInt(3, uid);
			ps.setInt(4, pid);
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

	public boolean subQuantity(int uid, int pid, int prc) {
		boolean flag = false;
		try {
			int quantity = 0, stotal;
			String query1 = "select * from cart where user_id = ? and product_id = ? ;";
			String query2 = "update cart set quantity = ?, subtotal = ? where user_id = ? and product_id = ? ;";
			PreparedStatement ps = con.prepareStatement(query1);
			ps.setInt(1, uid);
			ps.setInt(2, pid);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				quantity = rs.getInt("quantity");
				stotal = rs.getInt("subtotal");
			}
			quantity--;
			if (quantity == 0) {
				return flag;
			}
			stotal = prc * quantity;
			ps = con.prepareStatement(query2);
			ps.setInt(1, quantity);
			ps.setInt(2, stotal);
			ps.setInt(3, uid);
			ps.setInt(4, pid);
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

	public boolean deleteProductFromCart(int uid, int pid) {
		boolean flag = false;
		try {
			String query = "delete from cart where user_id = ? and product_id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, uid);
			ps.setInt(2, pid);
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

	public boolean deleteProductFromCartForAll(int id) {
		boolean flag = false;
		try {
			String query = "delete from cart where product_id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
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
