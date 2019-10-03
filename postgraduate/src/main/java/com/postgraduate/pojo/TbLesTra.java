package com.postgraduate.pojo;

public class TbLesTra {
	private int id;
	private int lesid;
	private int traid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLesid() {
		return lesid;
	}
	public void setLesid(int lesid) {
		this.lesid = lesid;
	}
	public int getTraid() {
		return traid;
	}
	public void setTraid(int traid) {
		this.traid = traid;
	}
	public TbLesTra(int id, int lesid, int traid) {
		super();
		this.id = id;
		this.lesid = lesid;
		this.traid = traid;
	}
	public TbLesTra() {
		super();
	}
	@Override
	public String toString() {
		return "TbLesTra [id=" + id + ", lesid=" + lesid + ", traid=" + traid + "]";
	}
	
}
