package com.detail;

public class Review {
	private int r_id;
	private int u_id;
	private int p_id;
	private String review;
	private int stars;

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(int r_id, int u_id, int p_id, String review, int stars) {
		super();
		this.r_id = r_id;
		this.u_id = u_id;
		this.p_id = p_id;
		this.review = review;
		this.stars = stars;
	}

	public int getR_id() {
		return r_id;
	}

	public void setR_id(int r_id) {
		this.r_id = r_id;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

}
