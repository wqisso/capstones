package com.postgraduate.pojo;

public class TbUsers {
	private int username;
	private String password;
	private int enabled;
	public int getUsername() {
		return username;
	}
	public void setUsername(int username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public TbUsers(int username, String password, int enabled) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}
	public TbUsers() {
		super();
	}
	@Override
	public String toString() {
		return "TbUsers [username=" + username + ", password=" + password + ", enabled=" + enabled + "]";
	}
	
}
