package com.postgraduate.pojo;

public class TbSelCourse {
	private int stuid;
	private int lesteaid;
	private int flag;
	private int checked;
	private TbLesTea tbLesTea;
	private TbLesson tbLesson;
	private TbTeacher tbTeacher;
	
	
	





	public TbSelCourse() {
		super();
	}

	public TbLesTea getTbLesTea() {
		return tbLesTea;
	}
	public void setTbLesTea(TbLesTea tbLesTea) {
		this.tbLesTea = tbLesTea;
	}

	
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public int getLesteaid() {
		return lesteaid;
	}
	public void setLesteaid(int lesteaid) {
		this.lesteaid = lesteaid;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public int getChecked() {
		return checked;
	}
	public void setChecked(int checked) {
		this.checked = checked;
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

	public TbSelCourse(int stuid, int lesteaid, int flag, int checked, TbLesTea tbLesTea, TbLesson tbLesson,
			TbTeacher tbTeacher) {
		super();
		this.stuid = stuid;
		this.lesteaid = lesteaid;
		this.flag = flag;
		this.checked = checked;
		this.tbLesTea = tbLesTea;
		this.tbLesson = tbLesson;
		this.tbTeacher = tbTeacher;
	}

	@Override
	public String toString() {
		return "TbSelCourse [stuid=" + stuid + ", lesteaid=" + lesteaid + ", flag=" + flag + ", checked=" + checked
				+ ", tbLesTea=" + tbLesTea + ", tbLesson=" + tbLesson + ", tbTeacher=" + tbTeacher + "]";
	}

	
	

	
	
	
	
}
