package com.postgraduate.pojo;

import java.util.Date;

public class TbLesTea {
	private int id;
	private int lesid;
	private int teaid;
	private Date setdate;
	private int state;
	private int number;
	private TbLesson tbLesson;
	private TbTeacher tbTeacher;
	public TbLesTea() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "TbLesTea [id=" + id + ", lesid=" + lesid + ", teaid=" + teaid + ", setdate=" + setdate + ", state="
				+ state + ", number=" + number + ", tbLesson=" + tbLesson + ", tbTeacher=" + tbTeacher + "]";
	}



	public TbLesTea(int id, int lesid, int teaid, Date setdate, int state, int number, TbLesson tbLesson,
			TbTeacher tbTeacher) {
		super();
		this.id = id;
		this.lesid = lesid;
		this.teaid = teaid;
		this.setdate = setdate;
		this.state = state;
		this.number = number;
		this.tbLesson = tbLesson;
		this.tbTeacher = tbTeacher;
	}



	public TbLesson getTbLesson() {
		return tbLesson;
	}

	public void setTbLesson(TbLesson tbLesson) {
		this.tbLesson = tbLesson;
	}

	public TbTeacher getTbTeacher() {
		return tbTeacher;
	}

	public void setTbTeacher(TbTeacher tbTeacher) {
		this.tbTeacher = tbTeacher;
	}

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
	public int getTeaid() {
		return teaid;
	}
	public void setTeaid(int teaid) {
		this.teaid = teaid;
	}
	public Date getSetdate() {
		return setdate;
	}
	public void setSetdate(Date setdate) {
		this.setdate = setdate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
