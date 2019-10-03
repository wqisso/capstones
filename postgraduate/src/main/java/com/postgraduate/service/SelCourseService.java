package com.postgraduate.service;

import java.util.List;


import com.postgraduate.pojo.TbSelCourse;


public interface SelCourseService {
	/**
	 * 增加学生选课
	 * @return
	 */
	public void insert(int uid,int sid);
	/**
	 * 查询学生选课情况
	 * @return
	 */
	public List<TbSelCourse> selectAll(int id);
	/**
	 * 管理员查询学生选课情况
	 * @return
	 */
	public List<TbSelCourse> adminSelAll();

	/**
	 * 学生删除选课
	 * @return
	 */
	public void delete(int stuid,int lesteaid);
}
