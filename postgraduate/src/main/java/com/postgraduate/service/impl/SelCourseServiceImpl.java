package com.postgraduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgraduate.mapper.TbSelCourseMapper;

import com.postgraduate.pojo.TbSelCourse;
import com.postgraduate.service.SelCourseService;

@Service
public class SelCourseServiceImpl implements SelCourseService{
	@Autowired
	private TbSelCourseMapper tbSelCourseMapper;
	/**
	 * 增加学生选课
	 * @return
	 */
	@Override
	public void insert(int uid,int sid) {
		tbSelCourseMapper.insert(uid,sid);
		
	}
	@Override
	public List<TbSelCourse> selectAll(int id) {
		
		return tbSelCourseMapper.selectAll(id);
	}
	
	/**
	 * 删除已选课程
	 * @return
	 */
	@Override
	public void delete(int stuid, int lesteaid) {
		tbSelCourseMapper.delete(stuid, lesteaid);
		
	}
	@Override
	public List<TbSelCourse> adminSelAll() {
		
		return tbSelCourseMapper.adminSelAll();
	}
}
