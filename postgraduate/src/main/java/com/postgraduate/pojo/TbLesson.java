package com.postgraduate.pojo;

public class TbLesson {
	private int id;
	
	private String name;
	
	private String category;
	
	private double credit;
	
	private int hours;
	
	private String semester;
	
	private String open_unit;
	
	private String exam_method;
	
	private int state;
	
	private String remarks;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getOpen_unit() {
		return open_unit;
	}

	public void setOpen_unit(String open_unit) {
		this.open_unit = open_unit;
	}

	public String getExam_method() {
		return exam_method;
	}

	public void setExam_method(String exam_method) {
		this.exam_method = exam_method;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	

	

	

	

	@Override
	public String toString() {
		return "TbLesson [id=" + id + ", name=" + name + ", category=" + category + ", credit=" + credit + ", hours="
				+ hours + ", semester=" + semester + ", open_unit=" + open_unit + ", exam_method=" + exam_method
				+ ", state=" + state + ", remarks=" + remarks + "]";
	}

	public TbLesson(int id, String name, String category, double credit, int hours, String semester, String open_unit,
			String exam_method, int state, String remarks) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.credit = credit;
		this.hours = hours;
		this.semester = semester;
		this.open_unit = open_unit;
		this.exam_method = exam_method;
		this.state = state;
		this.remarks = remarks;
	}

	public TbLesson() {
		super();
	}

	

	
	
 }
