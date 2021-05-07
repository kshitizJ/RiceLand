package com.detail;

public class Order {
	private int oid;
	private int uid;
	private int pid;
	private String name;
	private int prc;
	private int quant;
	private int stotal;
	private String sts;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int oid, int uid, int pid, String name, int prc, int quant, int stotal, String sts) {
		super();
		this.oid = oid;
		this.uid = uid;
		this.pid = pid;
		this.name = name;
		this.prc = prc;
		this.quant = quant;
		this.stotal = stotal;
		this.sts = sts;
	}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
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

	public int getPrc() {
		return prc;
	}

	public void setPrc(int prc) {
		this.prc = prc;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public int getStotal() {
		return stotal;
	}

	public void setStotal(int stotal) {
		this.stotal = stotal;
	}

	public String getSts() {
		return sts;
	}

	public void setSts(String sts) {
		this.sts = sts;
	}

}
