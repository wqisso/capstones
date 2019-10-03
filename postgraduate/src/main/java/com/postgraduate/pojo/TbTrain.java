package com.postgraduate.pojo;

import java.sql.Timestamp;
import java.util.List;

public class TbTrain {
	private int id;
	private Timestamp years;
	private String title;
	private String category;
	private String major;
	private String target;
	private double total;
	private double public_lesson;
	private double basic_theory;
	private double select_lesson;
	private String educate;
	private String paper;
	private String reply;
	private String plan;
	private int state;
	private List<TbLesson> lesList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getYears() {
		return years;
	}
	public void setYears(Timestamp years) {
		this.years = years;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getPublic_lesson() {
		return public_lesson;
	}
	public void setPublic_lesson(double public_lesson) {
		this.public_lesson = public_lesson;
	}
	public double getBasic_theory() {
		return basic_theory;
	}
	public void setBasic_theory(double basic_theory) {
		this.basic_theory = basic_theory;
	}
	
	public double getSelect_lesson() {
		return select_lesson;
	}
	public void setSelect_lesson(double select_lesson) {
		this.select_lesson = select_lesson;
	}
	public String getEducate() {
		return educate;
	}
	public void setEducate(String educate) {
		this.educate = educate;
	}
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public List<TbLesson> getLesList() {
		return lesList;
	}
	public void setLesList(List<TbLesson> lesList) {
		this.lesList = lesList;
	}
	public TbTrain() {
		super();
	}
	public TbTrain(int id, Timestamp years, String title, String category, String major, String target, double total,
			double public_lesson, double basic_theory, double select_lesson, String educate, String paper, String reply,
			String plan, int state, List<TbLesson> lesList) {
		super();
		this.id = id;
		this.years = years;
		this.title = title;
		this.category = category;
		this.major = major;
		this.target = target;
		this.total = total;
		this.public_lesson = public_lesson;
		this.basic_theory = basic_theory;
		this.select_lesson = select_lesson;
		this.educate = educate;
		this.paper = paper;
		this.reply = reply;
		this.plan = plan;
		this.state = state;
		this.lesList = lesList;
	}
	@Override
	public String toString() {
		return "TbTrain [id=" + id + ", years=" + years + ", title=" + title + ", category=" + category + ", major="
				+ major + ", target=" + target + ", total=" + total + ", public_lesson=" + public_lesson
				+ ", basic_theory=" + basic_theory + ", select_lesson=" + select_lesson + ", educate=" + educate
				+ ", paper=" + paper + ", reply=" + reply + ", plan=" + plan + ", state=" + state + ", lesList="
				+ lesList + "]";
	}

	
	
	
	
}
