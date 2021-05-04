package com.detail;

import java.util.Date;

public class Product {
	private int pid;
	private String name;
	private String path;
	private int price;
	private int star;
	private String description;
	private String category;
	private String status;
	private Date date;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String path, int price, int star, String description, String category, String status) {
		super();
		this.name = name;
		this.path = path;
		this.price = price;
		this.star = star;
		this.description = description;
		this.category = category;
		this.status = status;
	}

	public Product(int pid, String name, String path, int price, int star, String description, String category,
			String status, Date date) {
		super();
		this.pid = pid;
		this.name = name;
		this.path = path;
		this.price = price;
		this.star = star;
		this.description = description;
		this.category = category;
		this.status = status;
		this.date = date;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
