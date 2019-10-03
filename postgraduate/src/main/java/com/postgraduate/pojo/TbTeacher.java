package com.postgraduate.pojo;

public class TbTeacher {
	private int id;
	private String password;
	private String name;
	private String sex;
	private String birth;
	private String nation;
	private String place;
	private String political_appearance;
	private String title;
	private String years;
	private String direction;
	private String faculty;
	private String email;
	
	public TbTeacher() {
		super();
	}
	
	public TbTeacher(int id, String password, String name, String sex, String birth, String nation, String place,
			String political_appearance, String title, String years, String direction, String faculty, String email) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.nation = nation;
		this.place = place;
		this.political_appearance = political_appearance;
		this.title = title;
		this.years = years;
		this.direction = direction;
		this.faculty = faculty;
		this.email = email;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYears() {
		return years;
	}
	public void setYears(String years) {
		this.years = years;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "TbTeacher [id=" + id + ", password=" + password + ", name=" + name + ", sex=" + sex + ", birth=" + birth
				+ ", nation=" + nation + ", place=" + place + ", political_appearance=" + political_appearance
				+ ", title=" + title + ", years=" + years + ", direction=" + direction + ", faculty=" + faculty
				+ ", email=" + email + "]";
	}
	
	
}
