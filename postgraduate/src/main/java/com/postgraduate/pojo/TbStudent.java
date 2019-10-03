package com.postgraduate.pojo;

public class TbStudent {
	private int id;
	private String password;
	private String name;
	private String sex;
	private String birth;
	private String nation;
	private String educate;
	private String place;
	private String political_appearance;
	private String category;
	private String major;
	private int teacher_id;
	private TbUsers tbUsers;
	public TbUsers getTbUsers() {
		return tbUsers;
	}
	public void setTbUsers(TbUsers tbUsers) {
		this.tbUsers = tbUsers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getEducate() {
		return educate;
	}
	public void setEducate(String educate) {
		this.educate = educate;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getPolitical_appearance() {
		return political_appearance;
	}
	public void setPolitical_appearance(String political_appearance) {
		this.political_appearance = political_appearance;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	
	public TbStudent(int id, String password, String name, String sex, String birth, String nation, String educate,
			String place, String political_appearance, String category, String major, int teacher_id, TbUsers tbUsers) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.nation = nation;
		this.educate = educate;
		this.place = place;
		this.political_appearance = political_appearance;
		this.category = category;
		this.major = major;
		this.teacher_id = teacher_id;
		this.tbUsers = tbUsers;
	}
	public TbStudent() {
		super();
	}
	@Override
	public String toString() {
		return "TbStudent [id=" + id + ", password=" + password + ", name=" + name + ", sex=" + sex + ", birth=" + birth
				+ ", nation=" + nation + ", educate=" + educate + ", place=" + place + ", political_appearance="
				+ political_appearance + ", category=" + category + ", major=" + major + ", teacher_id=" + teacher_id
				+ ", tbUsers=" + tbUsers + "]";
	}
	
	

	
	
}
