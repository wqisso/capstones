package com.postgraduate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.postgraduate.mapper.TbLesTeaMapper;
import com.postgraduate.pojo.TbLesTea;
import com.postgraduate.pojo.TbLesson;
import com.postgraduate.pojo.TbStudent;
import com.postgraduate.service.LesTeaService;

import entity.PageResult;
@Service
public class LesTeaServiceImpl implements LesTeaService{
	@Autowired
	private TbLesTeaMapper lesTeaMapper;
	
	@Override
	public void insertLesTea(int lesid, int teaid) {
		lesTeaMapper.insertLesTea(lesid, teaid);
		
	}
	
	@Override
	public List<TbLesTea> selectAll() {
		
		return lesTeaMapper.selectAll();
	}
	/**
	 * 查询单个
	 * @return
	 */
	@Override
	public TbLesTea selectOne(int id) {
		// TODO Auto-generated method stub
		return lesTeaMapper.selectOne(id);
	}
	/**
	 * 修改课程
	 * @return
	 */
	@Override
	public void update(TbLesTea tbLesTea) {
		lesTeaMapper.updatebyid(tbLesTea);
		
	}
	/**
	 * 返回分页
	 * @return
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<TbLesTea> page = (Page<TbLesTea>) lesTeaMapper.selectAll();
		return new PageResult(page.getTotal(),page.getResult());
	}
	/**
	 * 学生查询开放选课返回分页
	 * @return
	 */
	@Override
	public PageResult stuFindPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<TbLesTea> page = (Page<TbLesTea>) lesTeaMapper.stuSelAll();
		return new PageResult(page.getTotal(),page.getResult());
	}
	/**
	 * 学生查询开放的选课
	 * @return
	 */
	@Override
	public List<TbLesTea> stuSelectAll() {
		// TODO Auto-generated method stub
		return lesTeaMapper.stuSelAll();
	}
}
