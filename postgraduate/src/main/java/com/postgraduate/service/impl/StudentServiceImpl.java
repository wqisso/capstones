package com.postgraduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.postgraduate.mapper.TbStudentMapper;
import com.postgraduate.pojo.TbStudent;
import com.postgraduate.service.StudentService;

import entity.PageResult;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private TbStudentMapper tbStudentMapper;
	
	@Override
	public List<TbStudent> selectAll() {
		
		return tbStudentMapper.selectAll();
	}
	/**
	 * 查询单个学生
	 * @return
	 */
	@Override
	public TbStudent selectOne(int id) {
		return tbStudentMapper.selectOne(id);
	}

	@Override
	public List<TbStudent> selectPart(TbStudent tbStudent) {
		
		return null;
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<TbStudent> page = (Page<TbStudent>) tbStudentMapper.selectAll();
		return new PageResult(page.getTotal(),page.getResult());
	}
	/**
	 * 增加学生
	 * @return
	 */
	@Override
	public void insert(TbStudent tbStudent) {
		tbStudentMapper.insert(tbStudent);
	}
	/**
	 * 修改学生
	 * @return
	 */
	@Override
	public void update(TbStudent tbStudent) {
		tbStudentMapper.updatebyid(tbStudent);
		
	}
	/**
	 * 修改学生密码
	 * @return
	 */
	@Override
	public void updatePassById(TbStudent tbStudent) {
		tbStudentMapper.updatePassById(tbStudent);
		
	}
	
	/**
	 * 模糊查询学生分页
	 * @return
	 */
	@Override
	public PageResult findPage(TbStudent tbStudent, int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		Page<TbStudent> page = (Page<TbStudent>)tbStudentMapper.selectPart(tbStudent);
		return new PageResult(page.getTotal(),page.getResult());
	}
}
